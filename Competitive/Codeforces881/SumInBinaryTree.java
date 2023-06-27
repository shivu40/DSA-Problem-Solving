package Competitive.Codeforces881;

import java.util.Arrays;
import java.util.Scanner;

public class SumInBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T > 0){
            long n = sc.nextLong();
            long sum = 0;
            while(n > 0){
                sum += n;
                n = n >> 1;
            }

            System.out.println(sum);

            T--;
        }
    }

}
