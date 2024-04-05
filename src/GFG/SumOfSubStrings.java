package GFG;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SumOfSubStrings {
    public static void main(String[] args) {
        System.out.println("sub str sum");
        String unProcessed = "1234";
        String processed = "";
//        System.out.println(subStr(processed, unProcessed));
//        System.out.println(processedArrayList(processed, unProcessed));
//        helper();
//        helper2();

        System.out.println(sumSubstrings("1234"));

//        System.out.println(processedArrayList("", "1234"));
//        ArrayList<String> list = new ArrayList<>(Arrays.asList("1234", "123", "12", "1", "234", "23", "2", "34", "3", "4"));
//        System.out.println(list);
//        System.out.println(converter(list));

//        processedArrayList("", "123");

    }


    static ArrayList<String> processedArrayList(String processed, String unProcessed) {

        ArrayList<String> unProcessedList = subStr(processed, unProcessed);
        ArrayList<String> processedList = removeValues(unProcessedList, unProcessed);

        return processedList;
    }


    static ArrayList<String> subStr(String processed, String unProcessed) {
        if(unProcessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char c = unProcessed.charAt(0);
        ArrayList<String> left = subStr(processed + c, unProcessed.substring(1));
        ArrayList<String> right = subStr(processed, unProcessed.substring(1));

        left.addAll(right);
        return left;
    }

    static ArrayList<String> removeValues(ArrayList<String> list, String unProcessed) {
        ArrayList<String> processedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(unProcessed.contains(list.get(i))){
                processedList.add(list.get(i));
            }
        }
        return processedList;
    }

    static long converter(ArrayList<String> list) {
        long sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if(!list.get(i).isEmpty()){
                long num = Integer.parseInt(list.get(i));
                sum += num;
            }
        }
//        System.out.println(sum);
        return sum;
    }

    static long sumSubstrings(String s) {
        ArrayList<String> list =  processedArrayList("", s);
        long val = converter(list);
        long num = val%1000000007;
        return num;
    }

}
