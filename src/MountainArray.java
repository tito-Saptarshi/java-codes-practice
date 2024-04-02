public class MountainArray {
    public static void main(String[] args) {
        System.out.println("Mountain Array");
        int[] arr = {0,10,5,2};
        System.out.println(bitonicArray(arr));
    }

    static int bitonicArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while( start < end ){
            int mid = start + (end - start)/2;

            if(mid + 1 <= arr.length - 1 && arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }

        }
        return start;
    }
}
