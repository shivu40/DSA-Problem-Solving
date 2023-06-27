package Competitive.CodeforcesEdu150;

import java.util.ArrayList;
import java.util.Scanner;

public class KeepItBeautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T >0)
        {
            int q = sc.nextInt();
            int a[] = new int[q];
            ArrayList<Integer> nums = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            boolean flag = false;
            String ans = "";
            int firstNumber = 0;
            int secondNumber = 0;
            for(int i = 0; i < q; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < q; i++){

                if(i == 0){
                    firstNumber = a[i];
                    nums.add(a[i]);
                }
                if(flag == false){
                    if(i > 0 && a[i] < nums.get(nums.size() - 1) && a[i] <= firstNumber){
                        flag = true;
                        secondNumber = a[i];
//                        ans += "1";
                        sb.append("1");
                        nums.add(a[i]);
                    }else if(i > 0 && a[i] < nums.get(nums.size() - 1) && a[i] > firstNumber){
//                        ans += "0";
                        sb.append("0");
                    }else{
//                        ans += "1";
                        sb.append("1");
                        nums.add(a[i]);
                    }

                }else{
                    if(a[i] >= secondNumber && a[i] <= firstNumber){
//                        ans += "1";
                        sb.append("1");
                        secondNumber = a[i];
                        nums.add(a[i]);
                    }else{
//                        ans += "0";
                        sb.append("0");
                    }

                }
            }

            System.out.println(sb.toString());
            T--;
        }
    }

}
