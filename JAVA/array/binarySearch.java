public class binarySearch {

    public static int binary_Search(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // comparison

            if (numbers[mid] == key) { // found
                return mid;
            }
            // right 2nd half cond^n
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // return not exists
        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 4;
        System.out.println("index for key: " + binary_Search(numbers, key));
    }
}

// binaray search or prerequistite - sorted arrays
// pseudo code
// start=0, end = n-1
// while (start<=end)
// find mid
// compare mid & key
// mid = key --- found
// mid>key ----left
// mid<key ----right