package strings;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        System.out.println("sub sequence");
        String unProcessed = "abc";
        String processed = "";
//        subSeq(processed, unProcessed);
        System.out.println(subSeqSuingArrayList(processed, unProcessed));
    }


    // subSeq with void return type
    static void subSeq(String processed, String unProcessed) {
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char c = unProcessed.charAt(0);
        subSeq(c + processed, unProcessed.substring(1));
        subSeq(processed, unProcessed.substring(1));
    }

    // subSeq with arrayList return type
    static ArrayList<String> subSeqSuingArrayList(String processed, String unProcessed) {
        if(unProcessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char c = unProcessed.charAt(0);
        ArrayList<String> left = subSeqSuingArrayList(c + processed, unProcessed.substring(1));
        ArrayList<String> right = subSeqSuingArrayList(processed, unProcessed.substring(1));

        left.addAll(right);
        return left;
    }

}
