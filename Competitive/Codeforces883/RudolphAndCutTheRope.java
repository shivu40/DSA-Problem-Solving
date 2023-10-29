package Competitive.Codeforces883;

import java.util.Scanner;

public class RudolphAndCutTheRope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int n = sc.nextInt();
            int cnt = 0;
            for(int i = 0; i < n;i++){
               int a = sc.nextInt();
               int b = sc.nextInt();
               if(a > b) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
