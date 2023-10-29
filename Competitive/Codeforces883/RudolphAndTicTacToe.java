package Competitive.Codeforces883;

import java.util.Scanner;

public class RudolphAndTicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T-- > 0){

            String[][] board = new String[3][3];
            for(int i = 0; i < 3;i++){
                String str = "";

                str = sc.nextLine();

                board[i] = str.split("");
            }
            char winner = '.';
            for(int i = 0; i < 3;i++){
                int cross = 0;
                int nout = 0;
                int plus = 0;

                for(int j = 0; j < 3; j++){
                    if(board[i][j].equals("O")){
                        nout++;
                    }

                    if(board[i][j].equals("X")){
                        cross++;
                    }

                    if(board[i][j].equals("+")){
                        plus++;
                    }

                }

                if(cross >= 3){
                    winner = 'X';
                    break;
                }else if(plus >= 3){
                    winner = '+';
                    break;
                }else if(nout >= 3){
                    winner = 'O';
                    break;
                }

            }

            if(winner == '.'){
                for(int i = 0; i < 3;i++){
                    int cross = 0;
                    int nout = 0;
                    int plus = 0;

                    for(int j = 0; j < 3; j++){
                        if(board[j][i].equals("O")){
                            nout++;
                        }

                        if(board[j][i].equals("X")){
                            cross++;
                        }

                        if(board[j][i].equals("+")){
                            plus++;
                        }

                    }

                    if(cross >= 3){
                        winner = 'X';
                        break;
                    }else if(plus >= 3){
                        winner = '+';
                        break;
                    }else if(nout >= 3){
                        winner = 'O';
                        break;
                    }

                }
            }

            if(winner == '.'){
                int cross = 0;
                int nout = 0;
                int plus = 0;
                for(int i = 0; i < 3; i++){

                    if(board[i][i].equals("O")){
                        nout++;
                    }

                    if(board[i][i].equals("X")){
                        cross++;
                    }

                    if(board[i][i].equals("+")){
                        plus++;
                    }


                }

                if(cross >= 3){
                    winner = 'X';

                }else if(plus >= 3){
                    winner = '+';

                }else if(nout >= 3){
                    winner = 'O';

                }

                cross = 0;
                plus = 0;
                nout = 0;

                for(int i = 0, j = 2; i < 3 && j >= 0; i++, j--){
                    if(board[i][j].equals("O")){
                        nout++;
                    }

                    if(board[i][j].equals("X")){
                        cross++;
                    }

                    if(board[i][j].equals("+")){
                        plus++;
                    }
                }
                if(cross >= 3){
                    winner = 'X';

                }else if(plus >= 3){
                    winner = '+';

                }else if(nout >= 3){
                    winner = 'O';

                }

            }


            if(winner == '.'){
                System.out.println("DRAW");
            }else{
                System.out.println(winner);
            }



        }
    }
}
