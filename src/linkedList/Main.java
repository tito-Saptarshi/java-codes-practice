package linkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(5);
        list.display();
        list.insert(22, 1);
        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}
