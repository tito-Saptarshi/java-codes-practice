package NeetCode.Stack;

import java.util.ArrayList;
import java.util.HashMap;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println("hello Valid Parentheses");
        System.out.println(isValid("([]){"));;
    }

    static boolean isValid(String s) {
//        HashMap<String, String> map = new HashMap<>();
//        map.put(")", "(");
//        map.put("}", "}");
//        map.put("]", "[");

        ArrayList<String> list = new ArrayList<>();
        list.add("asd");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                list.add("(");
            if (s.charAt(i) == '{')
                list.add("{");
            if (s.charAt(i) == '[')
                list.add("[");

            if (s.charAt(i) == ']'){
                if(list.get(list.size() - 1) == "[")
                    list.remove(list.size() - 1);
                else return false;
            }
            if (s.charAt(i) == ')'){
                if(list.get(list.size() - 1) == "(")
                    list.remove(list.size() - 1);
                else return false;
            }
            if (s.charAt(i) == '}'){
                if(list.get(list.size() - 1) == "{")
                    list.remove(list.size() - 1);
                else return false;
            }
            System.out.println(list);

        }
        System.out.println("end");
        System.out.println(list);
        list.remove(0);
        if (list.isEmpty()) {
            return true;
        }
        return false;
    }


}
