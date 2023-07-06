package Competitive.Codeforces881;

import java.util.Arrays;
import java.util.Scanner;

public class TrackingSegments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] segments = new int[m][2];
            for(int i = 0; i < m;i++){
                segments[i][0] = sc.nextInt();
                segments[i][1] = sc.nextInt();
            }
            int q = sc.nextInt();
            int[] changes = new int[q];
            for(int i = 0; i < q;i++){
                changes[i] = sc.nextInt();
            }

            int[] arr = new int[n + 1];

            for(int i = 0; i < q;i++){
                arr[changes[i]] = 1;
            }

            int[] preSum = new int[n + 1];
            int sum = 0;
            for(int i = 1; i < n; i++){
                sum += arr[i];
                preSum[i] = sum;
            }



            System.out.println(sum);

            T--;
        }
    }
}
