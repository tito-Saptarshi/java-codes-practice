package NeetCode;

import java.util.*;

public class ValidSudoKu {
    public static void main(String[] args) {
        System.out.println("valid sudoku 36");
        char[][] boards =
                {
                        {'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}
                };
        System.out.println(isValidSudoku(boards));;
    }

    static boolean isValidSudoku(char[][] board) {
//        Integer[][] arr = new Integer[9][9];
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if (board[i][j] != '.'){
//                    int val = Integer.parseInt(board[i][j] + "");
//                    arr[i][j] = val;
//                }
//                else {
//                    arr[i][j] = 0;
//                }
//            }
//            for (Integer[] a : arr) {
//                System.out.println(Arrays.toString(a));
//            }
//        }
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println("row");
        for (int i = 0; i < 9; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                if(board[i][j] != '.'){
                    if(!list.contains(Integer.parseInt(board[i][j] + ""))){
                        list.add(Integer.parseInt(board[i][j] + ""));
                    }
                    else {
                        return false;
                    }
                }
            }
            System.out.println(list);
        }
        System.out.println("column");
        for (int i = 0; i < 9; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                if(board[j][i] != '.'){
                    if(!list.contains(Integer.parseInt(board[j][i] + ""))){
                        list.add(Integer.parseInt(board[j][i] + ""));
                    }
                    else {
                        return false;
                    }
                }

            }
            System.out.println(list);
        }

        //    checking boxes
        int row = 0;
        int index = 0;
        int col = 0;
        for(int m = 0; m < 3; m++) {
            index=0;
            while (index < 3) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = col; i < col+3; i++) {
                    for(int j = row; j < row+3; j++) {
                        if(board[i][j] != '.'){
                            if(!list.contains(Integer.parseInt(board[i][j] + ""))){
                                list.add(Integer.parseInt(board[i][j] + ""));
                            }
                            else {
                                return false;
                            }
                        }
                    }
                }
                row +=3;
                index++;
            }

            row=0;
            col+=3;
        }



        return true;
    }
}
