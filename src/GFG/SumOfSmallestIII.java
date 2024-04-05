package GFG;

import java.util.ArrayList;
import java.util.List;

public class SumOfSmallestIII {

    public static void main(String[] args) {
        System.out.println(sumSubstrings("122"));
    }
    static long sumSubstrings(String s)
    {
        ArrayList<String> list = addToList(s);
        ArrayList<String> totalList = totalWays(list);
        long num = converter(totalList);
        return num;
    }
    static ArrayList<String> addToList(String s){
        ArrayList<String> list= new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i) + "");
        }
//        System.out.println(totalWays(list));
        return list;
    }

    static ArrayList<String> totalWays(ArrayList<String> list){
        ArrayList<String> localList= new ArrayList<>();
        String s = "";
        for (int i = 0; i < list.size(); i++) {
            s="";
            for (int j = i; j < list.size(); j++) {
                s = s + list.get(j);
                localList.add(s);
            }
        }
//        System.out.println(converter(localList));
        return localList;
    }

    static long converter(ArrayList<String> list) {
        long sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if(!list.get(i).isEmpty()){
                long num = Long.parseLong(list.get(i));
                sum += num;
            }
        }
//        System.out.println("su," + sum);
        return sum%1000000007;
    }

}

