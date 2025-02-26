public class selectionSort {
    public static void selection_Sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        selection_Sort(arr);
        printNum(arr);

    }
    public static void printNum(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i] + " ");
        
        }
        System.out.println();
    }
}

// public static void selection_Sort(int arr[]) {
// // outer loop -- no. of turns
// for (int i = 0; i < arr.length - 1; i++) {
// // int maxNum = Math.max(arr[i], arr[i+1]);
// int minpos = i;
// for (int j = i + 1; j <= arr.length - 1; j++) {
// if (arr[minpos] > arr[j]) {
// minpos = j;
// }
// }
// int temp = arr[minpos];
// arr[minpos] = arr[i];
// arr[i] = temp;
// }
// }

