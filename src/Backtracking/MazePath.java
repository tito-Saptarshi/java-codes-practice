package Backtracking;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class MazePath {
    public static void main(String[] args) {
        System.out.println("print maze paths");
        System.out.println(countPossiblePaths(3, 3));
        printpaths("", 3, 3);
        System.out.println(returnPathsIncludingDiagonal("", 3, 3));
    }

    // count total number of possible ways
    static int countPossiblePaths(int r, int c){
        if(r == 1 || c == 1)
            return 1;
        int down = countPossiblePaths(r-1,c);
        int right = countPossiblePaths(r, c-1);

        return down + right;
    }

    // printing the possible paths
    static void printpaths(String processed, int r, int c) {
        if(r == 1 && c == 1)
            System.out.println(processed);

        if(r > 1)
            printpaths(processed + 'R', r - 1, c);
        if(c > 1)
            printpaths(processed + 'D', r, c - 1);
    }

    // returning the possible paths in an arrayList
    static ArrayList<String> returnPathsInArrayList(String processed, int r, int c) {
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1)
            list.addAll( returnPathsInArrayList(processed + 'R', r - 1, c));
        if(c > 1)
            list.addAll(returnPathsInArrayList(processed + 'D', r, c - 1));

        return list;
    }

    static ArrayList<String> returnPathsIncludingDiagonal(String processed, int r, int c) {
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r > 1 && c > 1)
            list.addAll( returnPathsIncludingDiagonal(processed + 'D', r - 1, c - 1));
        if(r > 1)
            list.addAll( returnPathsIncludingDiagonal(processed + 'H', r - 1, c));
        if(c > 1)
            list.addAll(returnPathsIncludingDiagonal(processed + 'V', r, c - 1));

        return list;
    }
}
