//package NeetCode;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class KtopFrequency {
//    public static void main(String[] args) {
//        System.out.println("highest freq");
//        int[] arr = {1,1,1,2,2,3};
//        int k = 2;
//        System.out.println(Arrays.toString(secFun(arr, k)));
//    }
//
//    static int[] topKFrequent(int[] nums, int k) {
//        if (nums.length < 2) {
//            return nums;
//        }
//        Arrays.sort(nums);
//        int n = nums[nums.length - 1];
//        int[] arr = new int[n];
//        int last = nums[nums.length - 1];
//        int secondLast = nums[nums.length - 2];
//        int sum = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            if(nums[i] == nums[i+1]){
//                sum++;
//            }
//            else{
//                sum++;
//                arr[nums[i]] = sum;
//                sum = 0;
//            }
//        }
//
//        Arrays.sort(arr);
////        System.out.println(Arrays.toString(arr));
//        int[] arr2 = new int[k];
//        int index = arr.length - 1;
//        while (k > 0) {
//            arr2[k - 1] = arr[index];
////            System.out.println(arr[index]);
//            index--;
//            k--;
//        }
//
//        return arr2;
//    }
//
//    static int[] secFun(int[] arr, int k) {
//        Arrays.sort(arr);
//        int n = arr[arr.length - 1];
//        n++;
////        System.out.println(n);
//        int[] a = new int[n];
//        int[] a2 = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            a[arr[i]]++;
//            a2[arr[i]]++;
////            System.out.println(Arrays.toString(a));
//        }
//        Arrays.sort(a2);
//        int[] returnArr = new int[k];
//        int index = 0;
////        System.out.println("answer");
//        for (int i = a2.length - 1; i > -1 ; i--) {
//            for (int j = 0; j < a.length ; j++) {
//                if(a2[i] == a[j] && index < k){
//                    returnArr[index] = j;
//                    index++;
////                    System.out.println(j);
//                }
//            }
//        }
//        return returnArr;
//    }
//
//    static ArrayList<Integer> usingArrayList(int[] arr) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(Integer.MIN_VALUE);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < list.size(); j++) {
//                if( arr[i] == list.get(j)) {
//
//                }
//            }
//        }
//    }
//
//
//}
