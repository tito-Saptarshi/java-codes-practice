public class SumOfDigits {
    public static void main(String[] args) {
//        System.out.println(sumOfDigits(110000));
        System.out.println(productOfDigits(312));
    }
    static int sumOfDigits(int num) {
        if(num == 0)
            return 0;
        return num%10 + sumOfDigits(num/10);
    }

    static int productOfDigits(int num) {
        if(num == 0){
            return 1;
        }
        return num%10 * productOfDigits(num/10);
    }
}
