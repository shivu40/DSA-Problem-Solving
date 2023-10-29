package Competitive.Codeforces883;

import java.io.IOException;

import java.util.Scanner;

public class RudolphAndChristmasTree {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){

            int n = sc.nextInt();
            int d = sc.nextInt();
            int h = sc.nextInt();

            int[] heights = new int[n];

            for(int i = 0; i < n; i++){
                heights[i] = sc.nextInt();
            }
            double area = (d * 1.0 * h) / 2.0;
            double totalArea = area;


            for(int i = 0; i + 1 < n; i++){
                if(heights[i + 1] < heights[i] + h){
                     double b1 = ((heights[i] + h - heights[i + 1]) * 1.0 * d) / h;
                     totalArea += (d + b1) / 2.0 * (heights[i + 1] - heights[i]);
                }else{
                    totalArea += area;
                }
            }

            System.out.println(totalArea);

        }

    }
}
