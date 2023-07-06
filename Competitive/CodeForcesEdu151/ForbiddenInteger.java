package Competitive.CodeForcesEdu151;


import java.util.ArrayList;

import java.util.Scanner;

public class ForbiddenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            if(solveRec(1, n, k, x, list)){
                System.out.println("YES");
                System.out.println(list.size());
                for(int i = 0; i < list.size(); i++){
                    System.out.print(list.get(i) + " ");
                }
                System.out.println();
            }else{
                System.out.println("NO");
            }
            T--;
        }
    }

    static boolean solveRec(int i, int n, int k, int x, ArrayList<Integer> list){


        if(n == 0) return true;

        if(i > k) return false;


        //Taking that number from 1 time to possible number of times:
        if(i != x){

            if(i <= n){
                list.add(i);
                if(solveRec(i, n - i, k, x, list)){
                    return true;
                }
                list.remove(list.size() - 1);
            }

        }


        //Not taking that number:
        if(solveRec(i + 1, n, k, x, list)){
            return true;
        }

        return false;

    }
}
