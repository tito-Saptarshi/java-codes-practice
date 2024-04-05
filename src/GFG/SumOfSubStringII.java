package GFG;

import java.util.ArrayList;

public class SumOfSubStringII {
    public static void main(String[] args) {
        System.out.println("alternate way");
        System.out.println(addToList("122"));
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
                long num = Integer.parseInt(list.get(i));
                sum += num;
            }
        }
//        System.out.println(sum);
        return sum%1000000007;
    }

}
