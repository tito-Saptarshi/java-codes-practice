package Codeforces.Contest;

import java.util.HashMap;
import java.util.Scanner;

public class Stickogon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int j = 0; j < a; j++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(polygonCount(arr, n));
        }
    }

    static int polygonCount(int[] arr, int n) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            }
            else {
                int val = map.get(arr[i]);
                val+=1;
                map.put(arr[i], val);
            }
        }
        int count = 0;

        for (int value : map.values()) {
            count += value / 3;
        }
        return count;
    }

}
