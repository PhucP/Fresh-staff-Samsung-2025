package HUSTack;

import java.util.Arrays;
import java.util.Scanner;

public class PepsiDelivery {
    static int n, K, Q; // số khách hàng, số xe tải, tải trọng xe
    static int[] d; // yêu cầu hàng hóa của khách hàng
    static int[][] c; // ma trận khoảng cách
    static int[] route; // route[i] là xe đang phục vụ khách hàng i
    static int[] load; // tải trọng hiện tại của mỗi xe
    static int[] currentDistance; // tổng khoảng cách hiện tại của mỗi xe
    static int bestCost = Integer.MAX_VALUE; // chi phí tốt nhất tìm thấy

    static void backtrack(int client) {
        if (client > n) { // Nếu đã phân tất cả khách hàng
            int totalDistance = Arrays.stream(currentDistance).sum();
            bestCost = Math.min(bestCost, totalDistance);
            return;
        }

        for (int k = 1; k <= K; k++) { // Thử gán khách hàng này cho xe tải k
            if (load[k] + d[client] <= Q) { // Nếu xe tải còn đủ chỗ
                // Lưu trạng thái hiện tại
                route[client] = k;
                load[k] += d[client];

                // Tìm khách hàng gần nhất trước đó để nối tuyến đường
                int prevClient = 0;
                for (int i = 1; i < client; i++) {
                    if (route[i] == k) prevClient = i;
                }

                // Cập nhật khoảng cách
                currentDistance[k] += c[prevClient][client];

                // Nếu tổng quãng đường hiện tại chưa vượt qua lời giải tốt nhất
                if (currentDistance[k] < bestCost) {
                    backtrack(client + 1); // Tiếp tục với khách hàng tiếp theo
                }

                // Quay lui
                currentDistance[k] -= c[prevClient][client];
                load[k] -= d[client];
                route[client] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        K = sc.nextInt();
        Q = sc.nextInt();

        d = new int[n + 1];
        for (int i = 1; i <= n; i++) d[i] = sc.nextInt();

        c = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= n; j++)
                c[i][j] = sc.nextInt();

        // Khởi tạo biến
        route = new int[n + 1];
        load = new int[K + 1];
        currentDistance = new int[K + 1];

        // Gọi quay lui để tìm giải pháp tối ưu
        backtrack(1);

        System.out.println(bestCost);
    }
}
