package strings;

public class RemoveCharacter {
    public static void main(String[] args) {
        System.out.println("remove char");
        String oldStr = "aabbccddaabb";
        char target = 'a';
        System.out.println("without return");
        removeChar("", oldStr, target);
        System.out.println("with return");
        System.out.println(removeCharAndReturnString("", oldStr, target));
    }

    // without any return value
    static void removeChar(String newStr, String oldStr, char target) {
//        if(oldStr == ""){
//            System.out.println(newStr);
//            return;
//        }
        if(oldStr.isEmpty()){
            System.out.println(newStr);
            return;
        }
        char firstChar = oldStr.charAt(0);

        if (firstChar == target) {
            removeChar(newStr, oldStr.substring(1), target);
        }
        else {
            removeChar(firstChar + newStr , oldStr.substring(1), target);
        }
    }

    // returning the string
    static String removeCharAndReturnString(String newStr, String oldStr, char target) {
//        if (oldStr == "")
//            return newStr;
        if (oldStr.isEmpty())
            return newStr;

        char firstChar = oldStr.charAt(0);
        if (firstChar == target) {
            return removeCharAndReturnString(newStr, oldStr.substring(1), target);
        }
        else {
           return firstChar +  removeCharAndReturnString( newStr , oldStr.substring(1), target);
        }

    }

}
