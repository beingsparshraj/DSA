public class circular_queue_array {

    static int arr[];
    static int size;
    static int rear = -1;
    static int front = -1;

    //    constructor calls
    Queue(int n) {
        arr = new int[n];
        this.size = n;
    }

    public static boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public static boolean isFull() {
        return (rear + 1) % size == front;
    }

    //    enqueue
    public static void add(int data) {
        if (isFull()) {
            System.out.println("full circular queue");
            return;
        }
//        add 1st element
if(front == -1
)
    }


    public static void main(String[] args) {

    }
}
