package NeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println("dup ele");
    }

    static boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr);
        if (arr.length < 2)
            return false;
        for (int i = 0; i < arr.length - 1; i++) {
           if(arr[i] == arr[i + 1])
               return true;
        }
        return false;
    }
}
