package Competitive.Codeforces881;

import java.util.Arrays;
import java.util.Scanner;

public class SashaAndArrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T > 0){
            int n = sc.nextInt();
            int a[] = new int[n];

            for(int i = 0; i < n;i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);
            int i = 0;
            int j = n - 1;
            long sum = 0;
            while(i < j){
                sum += (a[j] - a[i]);
                i++;
                j--;
            }

            System.out.println(sum);

            T--;
        }
    }

}
