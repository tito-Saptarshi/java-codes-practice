package GFG;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        System.out.println("find second smallest");
        int[] arr = {1,2,3,4,5,6,11,12,33};
        System.out.println(Arrays.toString(getSecondOrderElements(arr.length, arr)));
//        System.out.println(secondSmallestValue(arr));
//        System.out.println(secondLargestValue(arr));
    }


    static int[] getSecondOrderElements(int n, int []arr) {

        // Arrays.sort(arr);

        if (arr.length == 1){
            return new int[]{ arr[0], arr[0]};
        }
        int secondLargest = secondLargestValue(arr);
        int secondSmallest = secondSmallestValue(arr);
        return new int[]{ secondLargest, secondSmallest};
    }

    static int secondSmallestValue(int[] arr){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < first ) {
                first = arr[i];

            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }
        return second;
    }

    static int secondLargestValue(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > first ) {
                first = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        return second;
    }

}
