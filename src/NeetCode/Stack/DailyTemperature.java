package NeetCode.Stack;

import java.util.ArrayList;
import java.util.Arrays;

public class DailyTemperature {
    public static void main(String[] args) {
        System.out.println("Daily temp");
        int[] arr = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));
    }

    static int[] dailyTemperatures(int[] temperatures) {
        int[] arr = new int[temperatures.length];
        int[] arr2 = new int[temperatures.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < temperatures.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < temperatures.length ; j++) {
                if(temperatures[i] >= temperatures[j]){
                    count++;
                }
                else {
//                    arr[i] = count + 1;
                    list.add(count + 1);
//                    System.out.println(count + " i = " + i+ " j = " + j);
                    break;
                }
            }

//            arr[i] = count;
//            System.out.println(count + " " + i);
        }
        int size = temperatures.length - list.size();
        while (size > 0) {
            list.add(0);
            size--;
        }
//        System.out.println(list);

//        Integer[] numberArray = list.toArray(new Integer[list.size()]);
//        arr2 = (int[]) .clone();
//        return numberArray;

        for (int i = 0; i < list.size(); i++) {
            arr2[i] = list.get(i);
        }
        return arr2;
    }

}
