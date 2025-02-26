class Node {
    int val;
    Node next;

    // paramertied constructor
    Node(int val) {
        this.val = val;
    }
}

class Practice {
    Node head;
    Node tail;
    int size;

    void size(){
        System.out.print("size of LL" +size + " ");
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    void insertTail(int val) {
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;

        }size++;

    }

    void insertHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }size++;
    }

    void insertFromIndex(int val, int idx) {
        if(idx<0 || idx>size){
            System.out.println("invalid index");
        }
        Node temp = new Node(val);
        Node x = head;
        for (int i = 1; i <= idx - 1; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;

    }
}

public class allInserMethod {
    public static void main(String[] args) {
        Practice list = new Practice();
        list.insertTail(50);
        list.insertTail(50);
        list.insertTail(50);
        list.insertHead(100);
        list.insertFromIndex(1000, 1);
        list.size();
        list.print();
    }

}