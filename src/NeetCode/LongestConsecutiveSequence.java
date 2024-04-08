package NeetCode;

import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println("longest seq");
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        int[] arr2 = {1,2,3,4,7,8,9};
        int[] arr3 = {2};
        System.out.println(longestConsecutive(arr3));
    }

    static int longestConsecutive(int[] arr) {
        if(arr.length < 1)
            return 0;
        int temp = 1;
        Arrays.sort(arr);
        
        ArrayList<Integer> list  = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]){

            }
            else if (arr[i+1] - arr[i] == 1 ) {
                temp = temp + 1;
            }
            else {
                list.add(temp);
                temp = 1;
//                System.out.println(list);
            }

        }
        list.add(temp);
        Collections.sort(list);
//        System.out.println(list);

        return list.get(list.size() - 1);
    }

}
