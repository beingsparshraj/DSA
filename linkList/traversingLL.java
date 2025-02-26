public class traversingLL {

    public static void traverseUsingRecursion(Node head){
        if(head == null) return;
         System.out.print(head.val+ " ");
         traverseUsingRecursion(head.next);
     }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        Node head = a;

        // using for loop

        Node tem = a;
        for(int i= 1;i<5;i++){
            System.out.println(tem.val);
            tem = tem.next;
        }

        // using while loop

        Node temp =a ;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }

        // print by recurison
        traverseUsingRecursion(head);
    }

}