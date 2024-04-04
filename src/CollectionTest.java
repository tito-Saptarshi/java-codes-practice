import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionTest {
    public static void main(String[] args) {
        System.out.println("practice 2");
        int[] arr = {1,2,3,4,5,6,11,12,33};
        int[] arr2 = {2};
        rev2(arr2);

    }

//    static int[] rev(int[] arr) {
//        Collections.reverse(Arrays.asList(arr));
//
//        System.out.println(Arrays.asList(arr));
//        return arr;
//    }

    static void rev2(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b) {
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
    }
}
