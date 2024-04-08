package NeetCode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println("array product");
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf2(arr)));

    }

    static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        if(n < 2)
            return arr;
        int[] prefix = new int[n + 1];
        int[] postfix = new int[n + 1];
        int[] answer = new int[n];


        prefix[0] = 1;
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = arr[i-1];
        }
        System.out.println(Arrays.toString(prefix));

        postfix[postfix.length - 1] = 1;
        for(int i = 0; i < arr.length; i++) {
            postfix[i] = arr[i];
        }
        System.out.println(Arrays.toString(postfix));


        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] * prefix[i];
        }
        System.out.println(Arrays.toString(prefix));
        for(int i = postfix.length - 2; i >= 0; i--) {
            postfix[i] = postfix[i+1] * postfix[i];
        }
        System.out.println(Arrays.toString(postfix));
        System.out.println("debugging....");

        for (int i = 1; i < postfix.length; i++) {
            answer[i-1] = prefix[i-1] * postfix[i];
        }
        return answer;
    }

    static int[] productExceptSelf2(int[] arr) {
        int n = arr.length;
        if(n < 2)
            return arr;
        int[] answer = new int[n];
        int prefix = 1;
        answer[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            prefix = prefix * arr[i-1];
            answer[i] = prefix;
        }
        System.out.println(Arrays.toString(answer));

        int postfix = 1;
        for (int i = arr.length - 1; i > 0 ; i--) {
            postfix = arr[i] * postfix;
            answer[i - 1] = answer[i - 1] * postfix;
        }

        return answer;
    }


}
