import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    // using space complexity = O(n)
    // no extra space required i.e copying the array etc not required

    // time complexity:
    // best case O(n) => sorted
    // worst Case : O(n^2) => sorted in opposite
    public static void bubbleSorting(int arr[]) {
        // run the steps n - 1 times
        for (int i = 0; i <= arr.length; i++) {
            // for each step, max item willl come at the best respectivly index
            for (int j = 1; j <= arr.length - i - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    // swap if the item is smaller than the previous item
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                // if array is already swapped then

            }
        }
    }

}