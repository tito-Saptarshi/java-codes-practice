//import java.util.*;
//
//public class CollectionTest {
//    public static void main(String[] args) {
//        System.out.println("practice 2");
//        int[] arr = {1,2,3,4,5,6,11,12,33};
//
//        hash2ddd();
//
//    }
//
////    static int[] rev(int[] arr) {
////        Collections.reverse(Arrays.asList(arr));
////
////        System.out.println(Arrays.asList(arr));
////        return arr;
////    }
//
//    static void rev2(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start < end) {
//            swap(arr, start, end);
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//
//    static void swap(int[] arr, int a, int b) {
//       int temp = arr[a];
//       arr[a] = arr[b];
//       arr[b] = temp;
//    }
//
//    static void charToInt() {
//        char i = '1';
//        System.out.println(i + 0);
//
//        System.out.println(Integer.parseInt(i + "") + 100);
//
//    }
//
//    static void hashsetchecker() {
//        HashSet<Integer> uniqueSet = new HashSet<>();
//        uniqueSet.add(1);
//        uniqueSet.add(2);
//        uniqueSet.add(3);
//        uniqueSet.add(4);
//        uniqueSet.add(5);
//
//        System.out.println(uniqueSet);
//
//        for (int value : uniqueSet) {
//            System.out.println("Value of element: " + value);
//        }
//
//        for (int i = 0; i < uniqueSet.size(); i++) {
//            // Convert set to array to access elements by index
//            Integer[] array = uniqueSet.toArray(new Integer[0]);
//            int value = array[i];
//            System.out.println("Value of element: " + value);
//        }
//        System.out.println(uniqueSet);
//        Integer[] array = uniqueSet.toArray(new Integer[uniqueSet.size()]);
//        System.out.println(Arrays.toString(array));
//    }
//
////    static void hash2d() {
////        HashMap<Integer[], Integer> map = new HashMap<>();
////        Integer[][] arr = {{1,2},{2,3},{4,5}};
////        Integer[] arr2 = {10,20,30};
////        for (int i = 0; i < arr.length; i++) {
////            for (int j = 0; j < 1; j++) {
////                map.put(arr[i][j], arr2[j]);
////            }
////        }
////        System.out.println(map);
////    }
//    static void hash2dd() {
//        Map<List<Integer>, Integer> map = new HashMap<>();
//        Integer[][] arr = {{1, 2}, {2, 3}, {4, 5}};
//        Integer[] arr2 = {10, 20, 30};
//        for (int i = 0; i < arr.length; i++) {
//            // Convert array to List
//            List<Integer> key = List.of(arr[i]);
//            // Use List as key
//            map.put(key, arr2[i]);
//
//            System.out.println(key);
//        }
//        System.out.println(map);
//    }
//
////    static void hash2ddd() {
////        List<Integer> key;
////        Integer[][] arr = {{1, 2}, {2, 3}, {4, 5}};
////        for (int i = 0; i < arr.length; i++) {
////            // Convert array to List
////             key = List.of(arr[i]);
////
////            System.out.println(key);
////        }
////        System.out.println();
////        ArrayList<String> list = new ArrayList<>();
////        for (int i = 0; i < arr.length; i++) {
////            System.out.println(Arrays.toString(arr[i]));
////
////        }
////        System.out.println("enddd");
////        System.out.println(key.get(1,1));
////        System.out.println(List.of(arr[1]));;
////    }
//
//}
