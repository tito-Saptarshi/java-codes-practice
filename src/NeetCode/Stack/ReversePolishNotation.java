package NeetCode.Stack;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversePolishNotation {
    public static void main(String[] args) {
        System.out.println("rev polish notation");
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        evalRPN(tokens);
        check(tokens);
    }

    static void evalRPN(String[] tokens) {
        ArrayList<Integer> list = new ArrayList<>();

//        list.addAll(Arrays.asList(tokens));
        list.add(Integer.MAX_VALUE);
        for (int i = 0; i < tokens.length; i++) {

            if (tokens[i].equals("+")) {
                int num1 = list.get(list.size() - 2);
                int num2 = list.get(list.size() - 1);
                int index = list.size() - 2;
                int num3 = num1 + num2;
                list.remove(list.size() - 1);
                list.remove(list.size() - 1);
                list.add(index, num3);
            }
            else if (tokens[i].equals("-")) {
                int num1 = list.get(list.size() - 2);
                int num2 = list.get(list.size() - 1);
                int index = list.size() - 2;
                int num3 = num1 - num2;
                list.remove(list.size() - 1);
                list.remove(list.size() - 1);
                list.add(index, num3);
            }
            else if (tokens[i].equals("*")) {
                int num1 = list.get(list.size() - 2);
                int num2 = list.get(list.size() - 1);
                int index = list.size() - 2;
                int num3 = num1 * num2;
                list.remove(list.size() - 1);
                list.remove(list.size() -1);
                list.add(index, num3);
            }
            else if (tokens[i].equals("/")) {
                int num1 = list.get(list.size() - 2);
                int num2 = list.get(list.size() - 1);
                int index = list.size() - 2;
                int num3 = num1 / num2;
                list.remove(list.size() - 1);
                list.remove(list.size() - 1);
                list.add(index, num3);
            }
            else {
                list.add(Integer.parseInt(tokens[i]));
            }
            System.out.println(list);
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == Integer.MAX_VALUE)
                list.remove(i);
        }
        System.out.println(list);
    }

    static void check(String[] tokens) {

        for (int i = 0; i < tokens.length; i++) {


            if (tokens[i] == "+") {
                System.out.println("plus");
            } else if (tokens[i] == "-") {
                System.out.println("minus");
            } else if (tokens[i] == "*") {
                System.out.println("product");
            } else if (tokens[i] == "/") {
                System.out.println("divide");
            }
            else System.out.println("number");
        }
    }


}
