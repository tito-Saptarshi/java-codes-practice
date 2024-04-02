public class BinarySeach {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 15, 22, 23};
        int target = 1;
        int[] arr2 = {3, 5, 1};
        System.out.println(binary(arr2, target, 2, arr2.length - 1));
    }
//    static int binary (int[] arr, int target, int start, int end) {
//        if (start > end)
//            return -1;
//
//        int mid = start + ( end - start) / 2;
//        System.out.printf("index: %d, value: %d", mid, arr[mid] );
//        System.out.println();
//
//        if ( arr[mid] == target)
//            return mid;
//
//        else if ( target < arr[mid] )
//            return binary(arr, target, start, mid - 1);
//
//        else
//            return binary(arr, target, mid + 1, end);
//    }

    static int binary (int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            else if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
