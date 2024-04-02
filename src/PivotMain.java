import com.sun.jdi.event.BreakpointEvent;

public class PivotMain {
    public static void main(String[] args) {
        System.out.println("pivot");
        int[] arr = { 3, 4, 5, 10, 121, 0, 1, 2};
        int[] arr2 = { 3, 5, 1};
        System.out.println(pivot(arr2));
    }
    static  int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            System.out.printf("start: %d, end: %d", start, end);
            System.out.println();
            int mid = start + (end - start)/2;
            if(mid+1 < arr.length && arr[mid] > arr[mid+1]){
                return arr[mid];
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
        return arr[mid];
    }
}
