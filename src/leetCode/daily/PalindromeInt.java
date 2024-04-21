package leetCode.daily;

public class PalindromeInt {
    public static void main(String[] args) {
        System.out.println("palindsssrome");
        System.out.println(reverse(1534236469));
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

    static int reverse(int x) {

        if(x < 0)
            x*=-1;
        String s = Integer.toString(x);
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            str += s.charAt(i);
        }
        int num = Integer.parseInt(str);
        System.out.println("x = " + x);
        System.out.println("num = " + num);
        if(x < 0)
            num*=-1;
        return num;
    }

}
