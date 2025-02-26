public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 18 };
        ReverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static int ReverseArray(int arr[]) {
        // with doing space complexity using swaping from start and end element
        // but time will same
        int first = 0, last = arr.length - 1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
        return -1;
    }
}
