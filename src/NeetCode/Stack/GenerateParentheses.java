package NeetCode.Stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println("Neetcode/Leetcode Parentheses");
//        System.out.println(generate("", 0,0,3));
        System.out.println(generateParenthesis(3));
    }

    static List<String> generateParenthesis(int n) {
        List<String> list = generate("", 0, 0, n);
        return list;
    }

    static List<String> generate(String s, int start, int end, int n) {
        if(start == n && end == n){
            List<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }
        List<String> list = new ArrayList<>();
        if(start < end)
            return  list;
        if (start <= n){
            List<String> left = generate(s + "(", start+1, end, n);
            list.addAll(left);
        }

        List<String> right = generate(s + ")", start, end+1, n);
        list.addAll(right);

        return list;
    }

}
