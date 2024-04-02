public class RotatedSearchArray {
    public static void main(String[] args) {
//        System.out.println("rotated search");
        int[] arr = { 7,8,1,2,3,4,5,6};
        int[] arr2 = {1};
        int[] arr3 = {3, 5, 1};
        int target = 1;
//        System.out.println(binary(arr3, target, 0, arr3.length - 1));
//        System.out.println(pivot(arr));
        System.out.println(search(arr3, target));
    }
    static int search(int[] nums, int target) {
        if(nums.length == 2){
            if(nums[0] == target)
                return 0;
            if(nums[1] == target)
                return 1;
        }
        int pivot = pivot(nums);
        int val1 = binary(nums, target, 0, pivot);
        int val2 = binary(nums, target, pivot + 1, nums.length - 1);
        if (val1 != -1){
            return val1;
        }
        else return val2;
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {


            int mid = start + (end - start)/2;
            if(mid+1 < arr.length && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[mid] > arr[end]){
                start = mid;

            }
            else if(arr[mid] < arr[end]) {
                end = mid;
            }
        }
//        System.out.println(arr[end]);
//        if(start + 1 < arr.length)
//            return arr[start + 1];
//        return -1;
        int mid = start + (end - start)/2;
        return mid;
    }

    static int binary(int[] arr, int target, int start, int end) {
        int mid = start + (end -  start)/2;

        if (start > end )
            return -1;
        if (arr[mid] == target)
            return mid;

        if (target < arr[mid]) {
            return binary(arr, target, start, mid - 1);
        }
        else if (target > arr[mid]){
            return binary(arr, target, mid + 1, end);
        }
        return -1;
    }
}
