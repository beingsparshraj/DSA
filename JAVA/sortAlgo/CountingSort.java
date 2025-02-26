public class CountingSort {
    public static void counting_sort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        printNum(arr);

    }

    public static void printNum(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println();
    }
}
