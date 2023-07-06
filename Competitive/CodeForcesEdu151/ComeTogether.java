package Competitive.CodeForcesEdu151;

import java.util.ArrayList;
import java.util.Scanner;

public class ComeTogether {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T > 0){
            int xa = sc.nextInt();
            int ya = sc.nextInt();
            int xb = sc.nextInt();
            int yb = sc.nextInt();
            int xc = sc.nextInt();
            int yc = sc.nextInt();

            long ans = 0;

            if((yb > ya && yc > ya) || (yb < ya && yc < ya)){
                if((xb > xa && xc < xa) || (xc > xa && xb < xa)){
                    ans += Math.min(Math.abs(yb - ya), Math.abs(yc - ya));
                    ans += 1;
                }else{
                    ans += Math.min(Math.abs(yb - ya), Math.abs(yc - ya));
                    ans += Math.min(Math.abs(xb - xa), Math.abs(xc - xa));
                    ans += 1;
                }
            }else{
                ans += 1;
            }
            System.out.println(ans);
            T--;
        }
    }


}
