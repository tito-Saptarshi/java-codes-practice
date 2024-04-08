//package testPackage;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//
//public class Hashsetcheck {
//    public static void main(String[] args) {
//        System.out.println("hashset");
//
//        char[][] boards =
//                {
//                        {'5','3','.','.','7','.','.','.','.'},
//                        {'6','.','.','1','9','5','.','.','.'},
//                        {'.','9','8','.','.','.','.','6','.'},
//                        {'8','.','.','.','6','.','.','.','3'},
//                        {'4','.','.','8','.','3','.','.','1'},
//                        {'7','.','.','.','2','.','.','.','6'},
//                        {'.','6','.','.','.','.','2','8','.'},
//                        {'.','.','.','4','1','9','.','.','5'},
//                        {'.','.','.','.','8','.','.','7','9'}
//                };
//        hashsetchk(boards);
//
//    }
//
//    static void hashsetchk(char[][] board) {
//        for (int i = 0; i < 9; i++) {
//            ArrayList<Integer> list = new ArrayList<>();
//            HashSet<Integer> set = new HashSet<>();
//            for (int j = 0; j < 9; j++) {
//                if (board[i][j] != '.') {
//                    if (!set.contains(board[i][j])) {
//                        set.add(Integer.parseInt(board[i][j] + ""));
//                    }
//                }
//            }
//            System.out.println(set);
//        }
//    }
//
//}
