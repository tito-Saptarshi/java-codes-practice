package LinkedListDefault;

import java.util.ArrayList;

//class  LL {
//    ArrayList<Integer> list = new ArrayList<>();
//    public void add(int value){
//        list.add(value);
//    }
//    public ArrayList<Integer> print() {
//        return list;
//    }
//
//}


class IndexedValue {
    private int index;
    private int value;

    public IndexedValue (int value, int index) {
        this.index = index;
        this.value = value;
    }

    public int getIndex () {
        return index;
    }

    public int getValue () {
        return value;
    }

}


class IndexedArrayList {
    ArrayList<IndexedValue> list = new ArrayList<>();

    public void addToList (int index, int value) {
        list.add(new IndexedValue(value, index));
    }

    public void getValue(int index) {
        System.out.println(list.get(index).getValue());;
    }

    public void getIndex(int value) {
        System.out.println(list.get(value).getIndex());;
    }

    public void print() {
        System.out.println(list);
    }
}


public class LinkedList {
    public static void main(String[] args) {
        IndexedArrayList listClass = new IndexedArrayList();
        listClass.addToList(0, 20);
        listClass.addToList(1, 30);
        listClass.addToList(2, 40);
//        listClass.getValue(1);
        listClass.getIndex(30);
        listClass.print();
    }
}
