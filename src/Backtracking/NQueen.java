//package Backtracking;
//
//public class NQueen {
//    public static void main(String[] args) {
//        System.out.println("Nqueen problem");
//    }
//
//    static boolean[][] maze = {
//            {false, false, false, false},
//            {false, false, false, false},
//            {false, false, false, false},
//            {false, false, false, false}
//    };
//
//    static void nqueen(boolean[][] maze, int r, int c) {
//        if(r == maze.length && c == maze[0].length){
//            printMaze(maze);
//            return;
//        }
//        if(r > maze.length) {
//            nqueen(maze);
//        }
//    }
//
//    static void printMaze(boolean[][] maze) {
//        for (boolean[] arr: maze) {
//            for (boolean value: arr) {
//                if(value)
//                    System.out.print("Q ");
//                else
//                    System.out.print("X ");
//            }
//            System.out.println();
//        }
//    }
//
//
//}
