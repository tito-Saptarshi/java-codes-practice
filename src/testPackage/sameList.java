package testPackage;

import java.util.ArrayList;

public class sameList {
    public static void main(String[] args) {
        System.out.println("list 2 check");
        listchecker();
    }

    static void listchecker() {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list1.add(i);
        }
        for (int i = 10; i > 0 ; i--) {
            list2.add(i);
        }
        for (int i = 0; i < 4; i++) {
            list3.add(i);
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        if(list1 == list3){
            System.out.println("yes same");
        }
        else {
            System.out.println("no not same");
        }
        if(list1.equals(list2))
            System.out.println("yeah");
        else
            System.out.println("no ");
    }
}
