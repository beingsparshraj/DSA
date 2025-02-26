public class BinarySearch {

    // time complexity for binary search is k = logn
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;

        System.out.println("index for key is : " + binarySearch(arr, key));
    }

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparison
            if (arr[mid] == key) {
                return mid;
            }
            // right condition
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                // left conditon first helf
                end = mid - 1;
            }
        }

        return -1;
    }
}