package Codeforces;

import java.sql.SQLOutput;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Codeforces.com hello world");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter digits");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("All elements");
        System.out.println(Arrays.toString(arr));
    }
}