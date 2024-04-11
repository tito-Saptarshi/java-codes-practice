package LinkedListDefault;

import java.util.ArrayList;
import java.util.HashMap;

public class HashmapArrayList {
    public static void main(String[] args) {
        System.out.println("hashmap arraylist");
        int[] arr = {10,20, 30, 10};

        HashMap<Integer, ArrayList<Integer>> map = hashArrList(arr);
        System.out.println(map);

        System.out.println("printing map after deleting value");
        HashMap<Integer, ArrayList<Integer>> map1 = deleteNum(map, 10);
    }

    static HashMap<Integer, ArrayList<Integer>> hashArrList(int[] arr) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(arr[i], list);
            }
            else {
                ArrayList<Integer> list = map.get(arr[i]);
                list.add(i);
            }
        }

        System.out.println(map);
        return map;
    }

    static HashMap<Integer, ArrayList<Integer>> deleteNum(HashMap<Integer, ArrayList<Integer>> map, int num) {
        ArrayList<Integer> list =  map.get(num);
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println("printing map inside fun");
        System.out.println(map);
        return map;
    }

}
