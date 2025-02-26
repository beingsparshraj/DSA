class SLL {
    Node head;
    Node tail;
    int size;

    void deleteAtHead() throws Error {
        if (head == null)
            throw new Error("list is empty");
        head = head.next;
        size--;
    }

    void deleteAtTail(int idx) throws Error {
        if(idx==0){
            deleteAtHead();
            return;
        }
        if (head == null)
            throw new Error("list is empty");
        if(idx<0 || idx>=size)
            throw  new Error("Invalid index");
        Node temp = head;
         for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        // to check tail at right position
        if(temp.next==tail){
            tail = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    void insertfromEnd(int val) {
        // if LL is empty
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insertfromStart(int val) {

        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;

    }

    int getELement(int idx) {
        if (idx == size - 1)
            return tail.val;

        if (idx >= size || idx < 0) {
            System.out.println("Invalid Index!");
            return -1;
        }
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    void insertMethod(int idx, int val) {
        Node temp = new Node(val);
        Node x = head;

        if (idx == 0) {
            // TC = O(1)
            insertfromStart(val);
            return;
        }
        if (idx == size) {
            insertfromEnd(val);
            return;
        }
        if (idx > size) {
            System.out.println("invalid index!");
            return;
        }

        // TC = O(n);

        for (int i = 1; i <= idx - 1; i++) {
            x = x.next;
        }

        // insertion
        temp.next = x.next;
        x.next = temp;
        size++;
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    void size() {
        System.out.println("size of LL :" + size);
    }
}

public class insertLL {
    public static void main(String[] args) {
        // creating blankLinkList
        SLL list = new SLL();
        list.insertfromEnd(10);
        list.insertfromEnd(20);
        list.insertfromEnd(30);

        // list.insertfromStart(0);
        list.size();
        // list.insertMethod(2, 100);
        // System.out.println(list.getELement(3));
        // list.print();

        // list.deleteAtHead();
        list.deleteAtTail(2);
        list.print();
        list.size();

    }
}