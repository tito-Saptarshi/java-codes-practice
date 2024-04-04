package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWinner {
    public static void main(String[] args) {
        System.out.println("Find Winner Count");
        int[] arr = {1,2,3,4,54,56,31};

        int[] arr2 = {1,11,22,33,44,55,66,77,88,99};
        int target = 1000000000;
//        System.out.println(Arrays.toString(shift(arr2, 1 ,arr[0])));
//        shift(arr, arr[1]);
        System.out.println(getWinner(arr2, target));
//        System.out.println(test(arr2));
    }

//    static ArrayList<Integer> test(int[] list){
//        int n = list.length - 1;
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int num : list) {
//            arr.add(num);
//        }
//        System.out.println(arr);
//        arr.add(100);
////        alter(arr, 1, arr.get(0), n);
//        arr.remove(1);
//        return arr;
//    }

    static int getWinner(int[] list, int k) {
        int n = list.length - 1;
        int maxNum = -1;
        for (int i = 0; i < list.length; i++) {
            if(list[i] > maxNum) {
                maxNum = list[i];
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : list) {
            arr.add(num);
        }
        int temp = 0;
        while( temp != k) {
            if (arr.get(0) == maxNum){
                return maxNum;
            }
            if(arr.get(0) > arr.get(1)){
                alter(arr, 1 ,arr.get(1), n);
                temp++;
            }
            else {
                alter(arr, 0,arr.get(0), n);
                temp = 1;
            }
        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr);
        return arr.get(0);

    }

    static ArrayList<Integer> alter(ArrayList<Integer> list, int position, int value, int n) {
        list.add(value);
        list.remove(position);
        return list;
    }

}
