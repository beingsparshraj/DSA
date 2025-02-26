class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;

    }
}

public class mergeTwo {
    Node head;

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static Node merge(Node list1, Node list2) {
        Node temp1 = list1;
        Node temp2 = list2;

        // Creating a dummy node to simplify the merge process
        Node dummy = new Node(-1);
        Node temp = dummy;

        // Merge the two lists
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        // Edge case: one of the lists is exhausted
        if (temp1 == null)
            temp.next = temp2;
        else
            temp.next = temp1;

        return dummy.next; // Return the merged list, skipping the dummy node
    }

    public static void main(String[] args) {
        // Create first sorted list: 10 -> 30 -> 40 -> 60
        Node list1 = new Node(10);
        list1.next = new Node(30);
        list1.next.next = new Node(40);
        list1.next.next.next = new Node(60);

        // Create second sorted list: 20 -> 50 -> 70 -> 75
        Node list2 = new Node(20);
        list2.next = new Node(50);
        list2.next.next = new Node(70);
        list2.next.next.next = new Node(75);

        // Print both input lists
        System.out.print("List 1: ");
        print(list1);

        System.out.print("List 2: ");
        print(list2);

        // Merge the two lists
        Node mergedList = merge(list1, list2);

        // Print the merged list
        System.out.print("Merged List: ");
        print(mergedList);
    }
}
