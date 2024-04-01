public class BinarySeach {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 15, 22, 23};
        int target = 15;
        System.out.println(binary(arr, target, 0, arr.length - 1));
    }
    static int binary (int[] arr, int target, int start, int end) {
        if (start > end)
            return -1;

        int mid = start + ( end - start) / 2;
        System.out.printf("index: %d, value: %d", mid, arr[mid] );
        System.out.println();

        if ( arr[mid] == target)
            return mid;

        else if ( target < arr[mid] )
            return binary(arr, target, start, mid - 1);

        else
            return binary(arr, target, mid + 1, end);
    }
}
