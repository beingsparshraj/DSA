class Node {
    int val;
    Node next;

    // paramertied constructor
    Node(int val) {
        this.val = val;
    }
}

class SLL {
    Node head;
    Node tail;
}

public class leftMiddleLL {

    public static Node middlNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // return the middle node
        return slow;
    }

    public static void main(String[] args) {
        SLL list = new SLL();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node middle = leftMiddleLL.middlNode(head);
       System.out.println("middle value: " + middle.val);

    }
}
