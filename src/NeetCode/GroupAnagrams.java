//package NeetCode;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//
//public class GroupAnagrams {
//    public static void main(String[] args) {
//        System.out.println("group anagrams");
//        String[] strArr = {"eat","tea","tan","ate","nat","bat"};
//        groupAnagrams(strArr);
//
//    }
//
////    public void groupAnagrams(String[] strs) {
////        for (int i = 0; i < strs.length; i++) {
////            String s = strs[i];
////            HashMap<Character, Integer> map = new HashMap<>();
////            for (int j = 0; j < s.length(); j++) {
////                char c = s.charAt(i);
////                if (!map.containsKey(c)) {
////                    map.put(c, 1);
////                }
////                else {
////                    int val = map.get(c) + 1;
////                    map.put(c, val);
////                }
////            }
////            ArrayList<String> list = new ArrayList<>();
////
////        }
////    }
//
//    static void groupAnagrams(String[] strs){
//
//        String[] arr = new String[strs.length];
//        arr = strs.clone();
//
//        for (int i = 0; i < strs.length; i++) {
//            String s = arr[i];
//            char[] charArr = s.toCharArray();
//            Arrays.sort(charArr);
//            String str = new String(charArr);
//            arr[i] = str;
//        }
//        System.out.println(Arrays.toString(arr));
//
//
//        ArrayList<HashMap<Character, Integer>> hashList = new ArrayList<>();
//
//        for (int i = 0; i < strs.length; i++) {
//            String s = strs[i];
//            HashMap<Character, Integer> map = new HashMap<>();
//            for (int j = 0; j < s.length(); j++) {
//                char c = s.charAt(i);
//                if (!map.containsKey(c)) {
//                    map.put(c, 1);
//                }
//                else {
//                    int val = map.get(c) + 1;
//                    map.put(c, val);
//                }
//            }
//            for (HashMap<String, Integer> hashMap : map) {
//                if (hashMap.equals(map)) {
//
//                    break;
//                }
//            }
//        }
//
//
//    }
//
//    static ArrayList<Integer> hashchecker(String str, String[] strArr) {
//
//        //  Counting char length of each string
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if(!map.containsKey(c)){
//                map.put(c, 1);
//            }
//            else {
//                int val = map.get(c) + 1;
//                map.put(c, val);
//            }
//        }
//
//        for (int i = 0; i < strArr.length; i++) {
//
//        }
//
//    }
//
//
//}
