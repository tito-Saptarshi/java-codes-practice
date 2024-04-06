package NeetCode;

import java.util.Arrays;

public class IsValidAnagram {
    public static void main(String[] args) {
        System.out.println("Anagram");
//        helperFunction();
        System.out.println(isAnagram("nl", "cs"));
    }

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] arr1 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr1[(int)(s.charAt(i)) - 97]++;
        }

        int[] arr2 = new int[26];
        for (int i = 0; i < t.length(); i++) {
            arr2[(int)(t.charAt(i)) - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        return true;
    }

    static void helperFunction() {
        String s = "abc";
        System.out.println(s);
        System.out.println((int)(s.charAt(0)) - 97);
        int[] arr = new int[26];
        System.out.println(Arrays.toString(arr));
    }

}
