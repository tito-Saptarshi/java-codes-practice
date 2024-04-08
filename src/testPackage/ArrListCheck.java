package testPackage;

import java.util.ArrayList;

public class ArrListCheck {
    public static void main(String[] args) {
        System.out.println("list");
        arrlist();
    }
    static void arrlist(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(20);
        System.out.println(list);
        if(list.contains(330))
            System.out.println("yes");
        else System.out.println("no");
    }

}
