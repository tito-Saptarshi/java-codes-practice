package NeetCode.Stack;
import java.util.*;


public class MinStack {
    public static void main(String[] args) {
        System.out.println("min stack neetcode/leetcode");
        int a = -3;
        int b = 2;
        System.out.println(a/b);
//        stackChecker();
    }

    static ArrayList<Integer> list = new ArrayList<>();


    static void push(int val) {
        list.add(val);
    }

    static void pop() {
        if(list.isEmpty())
            return;
        list.remove(list.size() - 1);
    }

    static int top() {
        // if(list.isEmpty())
        //     retur;
        return list.get(0);
    }

    static int getMin() {
        if(list.size() == 1)
            return list.get(0);
        int num = Integer.MAX_VALUE;

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < num)
                num = list.get(i);
        }

        return num;
    }

    static void stackChecker() {

        push(-2);
        push(0);
        push(-3);
        System.out.println(getMin());;

        System.out.println(list);
        pop();
        System.out.println(list);
        System.out.println(top());;
    }




}
