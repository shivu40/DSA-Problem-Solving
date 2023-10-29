package Competitive.Codeforces883;


import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class RudolfAndTheAnotherCompetition {

  static class Pair implements Comparable<Pair> {
        int index,count;
        long penalty;
        Pair(int index,int count, long penalty){
            this.index = index;
            this.count = count;
            this.penalty = penalty;
        }

        public int compareTo(Pair e){
            if(this.count == e.count){
                if(this.penalty == e.penalty)
                    return Integer.compare(this.index,e.index);
                return Long.compare(this.penalty, e.penalty);
            }
            return Integer.compare(e.count, this.count);
        }
    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){

            int n = sc.nextInt();
            int m = sc.nextInt();
            int h = sc.nextInt();


            ArrayList<Pair> score = new ArrayList<>();

            int pos = 0;
            for(int i = 0; i < n; i++){

                ArrayList<Integer> a = new ArrayList<>();
                for(int j = 0; j < m; j++){
                    a.add(sc.nextInt());
                }
                Collections.sort(a);
                int sum = 0, count = 0; long penalty = 0;
                for(int j: a){
                    if(sum + j > h){
                        break;
                    }
                    sum += j;
                    count++;
                    penalty += sum;
                }
                score.add(new Pair(i,count, penalty));

            }
            Collections.sort(score);


            for(Pair p: score){
                pos++;
                if(p.index == 0){
                    break;
                }
            }

                System.out.println(pos);




        }

    }
}
