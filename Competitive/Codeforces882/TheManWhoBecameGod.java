package Competitive.Codeforces882;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TheManWhoBecameGod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;
            for(int i = 0; i < n;i++){
                a[i] = sc.nextInt();
            }
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 1; i < n; i++){
                list.add(Math.abs(a[i] - a[i - 1]));
                sum += Math.abs(a[i] - a[i - 1]);
            }

            Collections.sort(list, Collections.reverseOrder());

            for(int i = 0; i < k - 1; i++){
                sum -= list.get(i);
            }

            System.out.println(sum);


            T--;
        }
    }
}
