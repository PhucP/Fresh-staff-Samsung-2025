package HUSTack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class analyze_sale_order_of_an_ecommerce_company {
    public static int convertTimeToSecond(String time){
        String[] secondString = time.split(":");
        int seconds = 0;
        seconds += Integer.parseInt(secondString[0]) * 60 * 60;
        seconds += Integer.parseInt(secondString[1]) * 60;
        seconds += Integer.parseInt(secondString[2]);
        return seconds;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> revenueByShop = new HashMap<>();
        Map<String, Integer> revenueByCustomerAndShop = new HashMap<>();

        int totalRevenue = 0;
        int totalOrder = 0;
        int[] orderInTime = new int[86401];
        String[] lines;
        String line;

        while(true){
            line = bf.readLine();
            if(line.equals("#")) break;

            lines = line.split(" ");

            totalOrder++;
            int currentRevenue = Integer.parseInt(lines[2]);
            totalRevenue += currentRevenue;
            int second = convertTimeToSecond(lines[4]);
            orderInTime[second]+=currentRevenue;
            revenueByShop.put(lines[3], revenueByShop.getOrDefault(lines[3], 0) + currentRevenue);
            revenueByCustomerAndShop.put(lines[0] + "_" + lines[3], revenueByCustomerAndShop.getOrDefault(lines[0] + "_" + lines[3], 0) + currentRevenue);
        }

        for(int i = 1; i < orderInTime.length; i++){
            orderInTime[i] += orderInTime[i-1];
        }

        while(true){
            line = bf.readLine();
            if(line.equals("#")) break;
            lines = line.split(" ");

            switch (lines[0]) {
                case "?total_number_orders":
                    System.out.println(totalOrder);
                    break;
                case "?total_revenue":
                    System.out.println(totalRevenue);
                    break;
                case "?revenue_of_shop":
                    System.out.println(revenueByShop.getOrDefault(lines[1], 0));
                    break;
                case "?total_consume_of_customer_shop":
                    System.out.println(revenueByCustomerAndShop.getOrDefault(lines[1] + "_" + lines[2], 0));
                    break;
                case "?total_revenue_in_period":
                    int startTime = convertTimeToSecond(lines[1]);
                    int endTime = convertTimeToSecond(lines[2]);
                    System.out.println(orderInTime[endTime] - orderInTime[startTime-1]);
                    break;
            }
        }
    }
}