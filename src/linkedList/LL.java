package linkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int val) {
        if (head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
        return;

    }

    public void insert(int val, int index) {

        if(tail == null || index == 0){
            insertFirst(val);
            return;
        }
        if (index == size) {
           insertLast(val);
           return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;

        return;
    }

    public int deleteLast() {
        if (head == null || head.next == null){
            return deleteFirst();
        }
        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }
        int val = tail.value;
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteFirst() {
        if(head == null){
            return -1;
        }
        if(head.next == null) {
            tail = null;
            int val = head.value;
            head = head.next;
            return val;
        }
        int val = head.value;

        head = head.next;
        size--;
        return val;
    }

    public int delete(int index) {
        index--;
       if(head == null || head.next == null) {
           return deleteFirst();
       }
       if(index == size)
           return deleteLast();
       Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;
        return val;

    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


}
