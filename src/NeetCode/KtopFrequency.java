package NeetCode;

import java.util.Arrays;

public class KtopFrequency {
    public static void main(String[] args) {
        System.out.println("highest freq");
        int[] arr = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(arr, k)));
    }

    static int[] topKFrequent(int[] nums, int k) {
        if (nums.length < 2) {
            return nums;
        }
        Arrays.sort(nums);
        int n = nums[nums.length - 1];
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]){
                sum++;
            }
            else{
                arr[sum]++;
                sum = 0;
            }
        }
        Arrays.sort(arr);
        int[] arr2 = new int[k];
        for (int i = arr.length - 1; i > -1; i++) {
            if(k == 0) {
                return arr2;
            }
            if(arr[i] != 0) {
                arr2[k - 1] = arr[i];
                k--;
            }
        }

        return arr2;
    }

}
