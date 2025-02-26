class Node {
    int val;
    Node next;

    // paramertied constructor
    Node(int val) {
        this.val = val;
    }
}

public class linkList {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;
       


        // linking a node with b otherwise output will be null and error returned
        // a.next = b;
        // System.out.println(a.next.val);

        // printing via loops

        // head
        Node temp = a;
        for (int i=1; i <= 5; i++) {
            System.out.print(temp+" ");
            // used for next Link-List
            temp = temp.next;
        }

    }
}