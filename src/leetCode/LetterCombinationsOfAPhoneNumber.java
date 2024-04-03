package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        System.out.println("hello world letter combination");
        System.out.println(letterCombinations("25"));
    }

    static List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
            return new ArrayList<>();
        return subSeq("", digits);
    }

    static List<String> subSeq(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        List<String> list = new ArrayList<>();

        int digit = unProcessed.charAt(0) - '0';

        digit--;
        if(digit < 6) {
            for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                char ch = (char)('a' + i);
                list.addAll(subSeq(processed + ch, unProcessed.substring(1)));
            }
        }
        else if(digit == 6) {
            for (int i = (digit - 1) * 3; i <= digit * 3; i++) {
                char ch = (char)('a' + i);
                list.addAll(subSeq(processed + ch, unProcessed.substring(1)));
            }
        }

        else if(digit == 7) {
            for (int i = 19; i < 22; i++) {
                char ch = (char)('a' + i);
                list.addAll(subSeq(processed + ch, unProcessed.substring(1)));
            }
        }

        else if(digit == 8) {
            for (int i = 22; i <= 25; i++) {
                char ch = (char)('a' + i);
                list.addAll(subSeq(processed + ch, unProcessed.substring(1)));
            }
        }

        return list;
    }
}
