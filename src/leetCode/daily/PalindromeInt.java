package leetCode.daily;

public class PalindromeInt {
    public static void main(String[] args) {
        System.out.println("palindrome");
        System.out.println(isPalindrome(121));
    }

    static boolean isPalindrome(int x) {
        int x2 = x;
        int num = 0;
        while (x > 0) {
            num *=10;
            num += x%10;
            x = x/10;
        }
        System.out.println(x);
        if (num == x2)
            return true;
        return false;
    }
}
