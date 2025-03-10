package HUSTack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Basic_queries_on_array {
    public static int findMinMax(boolean isMax, int i, int j, int[] arr){
        int min = arr[i];
        int max = arr[i];
        for(int t = i + 1; t < j; t++){
            if(arr[t] < min) min = arr[t];
            if(arr[t] > max) max = arr[t];
        }
        return isMax ? max : min;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        String firstIn = bf.readLine();
        String[] firstSplit = firstIn.split(" ");
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(firstSplit[i]);
            sum += arr[i];
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }

        List<Integer> output = new ArrayList<Integer>();

        while (true) {
            String s = bf.readLine();
            if(s.equals("*")) continue;
            if(s.equals("***")) break;

            switch (s) {
                case "sum":
                    output.add(sum);
                    break;
                case "find-min":
                    output.add(min);
                    break;
                case "find-max":
                    output.add(max);
                    break;
                default:
                    String[] split = s.split(" ");
                    int i = Integer.parseInt(split[1]) - 1;
                    int j = Integer.parseInt(split[2]) - 1;
                    if(split[0].equals("find-min-segment")){
                        output.add(findMinMax(false, i, j, arr));
                    }
                    else {
                        output.add(findMinMax(true, i, j, arr));
                    }
                    break;
            }
        }

        bf.close();

        for(int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }

    }
}
