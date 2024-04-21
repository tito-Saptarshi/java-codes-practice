package Codeforces;

import java.util.Scanner;

public class ILoveUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(mainFunction(arr, n));
    }

    static int mainFunction(int[] arr, int n){
        int max = arr[0];
        int min = arr[0];

        int count = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
                count++;
            }
            if(arr[i] < min) {
                min=arr[i];
                count++;
            }
        }
        return count;
    }

}
