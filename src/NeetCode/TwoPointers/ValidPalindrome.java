package NeetCode.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println("two pointers package");
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));;
    }

    static boolean isPalindrome(String s) {
        String sUpdated = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' '){
                sUpdated = sUpdated + s.charAt(i);
            }
        }
        sUpdated = sUpdated.toLowerCase();
        sUpdated = sUpdated.replaceAll("[^a-zA-Z0-9]", "");
        if(sUpdated.length() < 2)
            return false;
        int back = sUpdated.length() - 1;
        int front = 0;

        while (front < back) {

            if(sUpdated.charAt(front) != sUpdated.charAt(back))
                return false;

            front++;
            back--;

        }
        System.out.println(sUpdated);
        return true;
    }

    static void helper1() {
        String s = "This is hell itself";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' '){
                s2 = s2 + s.charAt(i);
            }
        }
        String[] str = s.split("\\s+");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
        System.out.println(s2);
        System.out.println(list);
        System.out.println(Arrays.toString(str));
    }

}
