package strings;

public class SubSequence {
    public static void main(String[] args) {
        System.out.println("sub sequence");
        String unProcessed = "abc";
        String processed = "";
        subSeq(processed, unProcessed);
    }

    static void subSeq(String processed, String unProcessed) {
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char c = unProcessed.charAt(0);
        subSeq(c + processed, unProcessed.substring(1));
        subSeq(processed, unProcessed.substring(1));
    }

}
