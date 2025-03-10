package HUSTack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class analyze_orders_raised_over_times {

    public static int convertTime(String s){
        String[] secondString = s.split(":");
        int seconds = 0;
        seconds += Integer.parseInt(secondString[0]) * 60 * 60;
        seconds += Integer.parseInt(secondString[1]) * 60;
        seconds += Integer.parseInt(secondString[2]);

        return seconds;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> input = new ArrayList<Integer>();
        List<Integer> output = new ArrayList<Integer>();
        int maxTime = -1;
        int count = 0;
        String code;

        try {
            while(true) {
                code = br.readLine();

                if(code.equalsIgnoreCase("#")) break;

                String time = code.split(" ")[1];
                int seconds = convertTime(time);
                if(seconds > maxTime) maxTime = seconds;
                count++;

                input.add(seconds);
            }   

            int[] result = new int[maxTime + 1];
            int[] tempRes = new int[maxTime + 1];

            for(int i = 0; i < input.size(); i++){
                result[input.get(i)]++;
                tempRes[input.get(i)]++;
            }

            for(int i = 1; i < result.length; i++) {
                result[i] += result[i - 1];
            }

            while(true) {
                code = br.readLine();
                if(code.equalsIgnoreCase("###")) break;
                String[] line = code.split(" ");
                
                switch (line[0]) {
                    case "?number_orders":
                        output.add(count);
                        break;
                    case "?number_orders_in_period":
                        int time1 = convertTime(line[1]);
                        int time2 = convertTime(line[2]);
                        output.add(result[time2] - result[time1 -1]);
                        break;
                    case "?number_orders_at_time":
                        int tempTime = convertTime(line[1]);
                        output.add(tempRes[tempTime]);
                        break;
                }
                
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i : output){
            System.out.println(i);
        }
    }
}
