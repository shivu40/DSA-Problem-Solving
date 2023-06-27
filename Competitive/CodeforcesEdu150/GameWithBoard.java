package Competitive.CodeforcesEdu150;

import java.util.Scanner;

public class GameWithBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T > 0){
            int n = sc.nextInt();

            if(n <= 4){
                System.out.println("Bob");
            }else{
                System.out.println("Alice");
            }

            T--;
        }
    }
}
