package leetCode.daily;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println("iso strings");
    }

    static boolean isIsomorphic(String s, String t) {
        boolean first = isIsomorphicString(s, t);
        boolean second = isIsomorphicString(t, s);

        return first && second;
    }

    static boolean isIsomorphicString(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            }
            else {
                if(map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }


        return true;
    }

}
