public class array_implemen {
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
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

//    remove function is circular linked list

        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return arr[front];
        }


        public static void main(String[] args) {
            Queue q = new Queue(5);
            q.add(1);
            q.add(2);
            q.add(3);

            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }

        }
    }

}

