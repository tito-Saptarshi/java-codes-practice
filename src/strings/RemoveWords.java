package strings;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class RemoveWords {
    public static void main(String[] args) {
        System.out.println("skip words");
        String oldStr = "bjshdfapplesbjd";
        String newStr = "";
        String target = "apple";
//        System.out.printf("before: %s\n", oldStr);
//        System.out.print("after: ");
//        System.out.println();
        System.out.println(removeCharAndReturnString(newStr, oldStr, target));
    }

    static String removeCharAndReturnString(String newStr, String oldStr, String target) {

        if (oldStr.isEmpty()) {
            System.out.printf("final call :::    oldStr: %s newStr: %s\n", oldStr, newStr);
            return newStr;
        }

        if (oldStr.startsWith(target)) {
            return removeCharAndReturnString(newStr, oldStr.substring(target.length()), target);
        }
        else {
            return oldStr.charAt(0) + removeCharAndReturnString( newStr , oldStr.substring(1), target);
        }

    }
}
