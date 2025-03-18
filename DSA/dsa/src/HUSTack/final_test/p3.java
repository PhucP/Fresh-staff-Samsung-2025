package HUSTack.final_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class p3 {
    public static int convertTimeToSecond(String time){
        String[] secondString = time.split(":");
        int seconds = 0;
        seconds += Integer.parseInt(secondString[0]) * 60 * 60;
        seconds += Integer.parseInt(secondString[1]) * 60;
        seconds += Integer.parseInt(secondString[2]);
        return seconds;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> errorUser = new HashMap<>();
        Map<String, Integer> pointUserProblem = new HashMap<>();
        Map<String, Integer> pointUser = new HashMap<>();

        int totalErr = 0;
        int totalSession = 0;
        int[] submitInTime = new int[86401];
        String[] lines;
        String line;

        while(true){
            line = reader.readLine();
            if(line.equals("#")) break;
            lines = line.split(" ");

            totalSession++;
            int currentPoint = Integer.parseInt(lines[4]);
            int second = convertTimeToSecond(lines[2]);
            submitInTime[second]++;

            if(lines[3].equalsIgnoreCase("ERR")) {
                errorUser.put(lines[0], errorUser.getOrDefault(lines[0], 0) + 1);
                totalErr++;
            } else
            pointUserProblem.put(lines[0] + " " + lines[1] ,Math.max(pointUserProblem.getOrDefault(lines[0] + " " + lines[1], 0), currentPoint));
        }

        for(int i = 1; i < submitInTime.length; i++){
            submitInTime[i] += submitInTime[i-1];
        }

        pointUserProblem.forEach((t, u) -> {
            String user = t.split(" ")[0]; 
            pointUser.put(user, pointUser.getOrDefault(user, 0) + u);
        });

        while(true){
            line = reader.readLine();
            if(line.equals("#")) break;
            lines = line.split(" ");

            switch (lines[0]) {
                case "?total_number_submissions":
                    System.out.println(totalSession);
                    break;
                case "?number_error_submision":
                    System.out.println(totalErr);
                    break;
                case "?number_error_submision_of_user":
                    System.out.println(errorUser.getOrDefault(lines[1], 0));
                    break;
                case "?total_point_of_user":
                    System.out.println(pointUser.getOrDefault(lines[1], 0));
                    break;
                case "?number_submission_period":
                    int startTime = convertTimeToSecond(lines[1]);
                    int endTime = convertTimeToSecond(lines[2]);
                    System.out.println(submitInTime[endTime] - submitInTime[startTime-1]);
                    break;
            }
        }
        reader.close();
    }
}
