package Backtracking;

import java.util.ArrayList;

public class MazePathII {
    public static void main(String[] args) {
        System.out.println(allDirection("", 0, 0, maze));
        allPath("", 0, 0, maze);
    }

    static boolean[][] maze =
            {{true, true, true},
            {true, true, true},
            {true, true, true}};
    static ArrayList<String> allDirection(String processed, int r, int c, boolean[][] maze) {
        if(r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(!maze[r][c]){
            return list;
        }
        maze[r][c] = false;


        if(r > 0)
            list.addAll( allDirection(processed + 'U', r - 1, c, maze));
        if(r < maze.length - 1)
            list.addAll(allDirection(processed + 'D', r + 1, c, maze));
        if(c <  maze[0].length - 1)
            list.addAll( allDirection(processed + 'R', r, c + 1, maze));
        if(c > 0)
            list.addAll(allDirection(processed + 'L', r, c - 1, maze));

        maze[r][c] = true;
        return list;
    }

    static void allPath(String processed, int r, int c, boolean[][] maze) {
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(processed);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;

        if(r > 0)
            allPath(processed + 'U', r - 1, c, maze);
        if(r < maze.length - 1)
            allPath(processed + 'D', r + 1, c, maze);
        if(c <  maze[0].length - 1)
           allPath(processed + 'R', r, c + 1, maze);
        if(c > 0)
            allPath(processed + 'L', r, c - 1, maze);

        maze[r][c] = true;
        return;
    }
}
