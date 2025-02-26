public class insertionSort {
    public static void main(String[] args) {
        // insertion sort algorithm
        int[] arr = { 3, 5, 1, 4, 2 };
        int n = arr.length;
        for (int i = 1; i < n ; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j-1, j);
                    
                }
                else break;
            }

        }
        print(arr);
    }

    // time complexity
    // avg case = o(n2);
    // worst case = o(n2);
    // best case = o(n);


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
    }

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele);
        }
    }
}
