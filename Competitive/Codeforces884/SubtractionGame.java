package Competitive.Codeforces884;

import java.util.Scanner;

public class SubtractionGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a > 1 && b > 1){
                System.out.println(1);
            }else {
                if(a == 1 && b == 1){
                    System.out.println(2);
                }else if(a == 2 || b == 2){
                    System.out.println(3);
                }else{
                    System.out.println(2);
                }
            }

        }
    }
}
