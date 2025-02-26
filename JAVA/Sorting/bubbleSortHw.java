public class bubbleSortHw {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 5, 4 };
        // sort in decreasing order
        // using bubble sort
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j]<arr[j+1]) {
                    swap(arr, j);
                }
            }
        }
        print(arr);
    }

    public static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
