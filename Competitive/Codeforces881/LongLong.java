package Competitive.Codeforces881;

import java.util.Arrays;
import java.util.Scanner;

public class LongLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T > 0){
            int n = sc.nextInt();
            int a[] = new int[n];

            for(int i = 0; i < n;i++){
                a[i] = sc.nextInt();
            }

            long sum = 0;
            int count = 0;
            boolean allPositive = true;
            for(int i = 0; i < n; i++){
                if(a[i] < 0){
                    sum += -a[i];
                    allPositive = false;
                }else{
                    sum += a[i];
                }


            }
            int i = 0;

            while(true){

                while( i < n && a[i] >= 0){
                    i++;
                }

                if(i < n){
                    count++;
                }

                while(i < n && a[i] <= 0){
                    i++;
                }

                if(i >= n){
                    break;
                }
            }
            if(allPositive){
                count = 0;
            }

            System.out.println(sum + " " + count);

            T--;
        }
    }
}
