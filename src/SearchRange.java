public class SearchRange {
    public static void main(String[] args) {
        System.out.println("hello world");
        int[] arr = {5,7,7,8,8,10};
        int target = 7;
        System.out.println(small(arr, target));
        System.out.println(large(arr, target));
    }

    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};

        arr[0] = small(nums, target);
        arr[1] = large(nums, target);
        return arr;
    }

    static int small(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        boolean check = false;
        while(start <= end) {
            int mid = start + (end - start)/2;

            if(target <= nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
            if(nums[mid] == target){
                check = true;
            }
        }
        int mid = start + (end - start)/2;
        if (check)
            return mid;

        return -1;

    }
    static int large(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        boolean check = false;
        while(start <= end) {
            int mid = start + (end - start)/2;

            if(target >= nums[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
            if(nums[mid] == target){
                check = true;
            }
        }
        int mid = start + (end - start)/2;
        if (check)
            return mid - 1;

        return -1;

    }
}

