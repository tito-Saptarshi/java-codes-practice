package NeetCode;


import java.util.*;

public class KtopHashMap {

    public static void main(String[] args) {
        System.out.println("hashmap k top");
        int[] arr = {3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
        int k = 10;
        ktopFreq(arr, k);
        System.out.println(Arrays.toString(ktopFreq(arr,k)));
    }

    static int[] ktopFreq(int[] arr, int k) {

        if(arr.length < 2)
            return arr;

        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                int val = map.get(arr[i]);
                map.put(arr[i], val+1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
//        System.out.println(map);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.MIN_VALUE);
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if(arr[i] != list.get(j)) {
                    check = false;
                }
                else {
                    check = true;
                    break;
                }
            }
            if(!check)
                list.add(arr[i]);
//            System.out.println(list);
        }
//        System.out.println(list);
        list.remove(0);
        int n = map.size();

        int[][] arr2d = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr2d[i][0] = list.get(i);
        }
        for (int i = 0; i < n; i++) {
            arr2d[i][1] = map.get(list.get(i));
        }
//        for (int[] arr2 : arr2d) {
//            System.out.print(Arrays.toString(arr2));
//        }
//        System.out.println();

//        sortbyColumn(arr2d, 1);

        sort2DArray(arr2d);

//        System.out.println("array after sort");

//
//        for (int[] arr2 : arr2d) {
//            System.out.print(Arrays.toString(arr2));
//        }

        int[] finalArr = new int[k];
        int index = 0;
//        System.out.println();
        while (index < k) {
            for (int i = n - 1; i >= 0 && index < k; i--) {
                finalArr[index] = arr2d[i][0]; // Fill finalArr from the last elements of arr2d
//                System.out.println(arr2d[i][0]);
                index++;
            }

//            System.out.println(Arrays.toString(finalArr));
        }
//        System.out.println();
//        System.out.println(Arrays.toString(finalArr));

//        System.out.println("checker");
//        for (int i = n - 1; i > -1; i--) {
////            finalArr[index] = arr2d[i][0];
//            System.out.print(arr2d[i][0] + " ");
//        }
        return finalArr;
    }

    static void sort2DArray(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt((int[] row) -> row[1]));
    }

    static void sortbyColumn(int arr[][], int col)
    {
        // Using built-in sort function Arrays.sort
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            // Compare values according to columns
            public int compare(final int[] entry1,
                               final int[] entry2)
            {

                // To sort in descending order revert
                // the '>' Operator
                if (entry1[col] > entry2[col])
                    return 1;
                else
                    return -1;
            }
        }); // End of function call sort().
    }
}
