package NeetCode.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class DailyTemperatureUsingStack {
    public static void main(String[] args) {
        System.out.println("daily temp stack");

        int[] arr = {73,74,75,71,69,72,76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));

//        arraylist2dArray();

    }

    static int[] dailyTemperatures(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> map = hashArrList(arr);
        int[] arrDays = new int[arr.length];

        list.add(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            list.add(arr[i]);
            int days = 0;
            while(list.size() > 1 && list.get(list.size() - 1) > list.get(list.size() - 2)) {
                days = 0;
                int val = list.remove(list.size() - 2);

                ArrayList<Integer> indexValues = numIndexes(map, val);

                    for (int j = indexValues.size() - 1; j >= 0; j--) {
                        if(indexValues.get(j) < i) {
                            arrDays[indexValues.get(j)] = i - indexValues.get(j);
                            indexValues.remove(j);
                            break;
                        }
                    }


//                arrDays[indexValues.get(0)] = days;
//                System.out.println(list);
            }
        }
        System.out.println(list);
        System.out.println(map);
        return arrDays;
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

    static ArrayList<Integer> numIndexes(HashMap<Integer, ArrayList<Integer>> map, int num) {
        ArrayList<Integer> list =  map.get(num);

        return list;
    }


}
