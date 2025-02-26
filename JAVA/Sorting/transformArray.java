public class transformArray {
    public static void main(String[] args) {
        int[] arr = { 40, 12, 85, 56, 41, 23 };
        // transform
        // arr1 = {40,0,1,2}
        int x = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = 0; j < n; j++) {
                if (arr[j] < min && arr[j] > 0) {
                    min = arr[j];
                    mindx = j;
                }
            }
            arr[mindx] = x;
            x--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] *= (-1);
        }

        print(arr);
    }

    public static void swap(int[] arr, int i, int j) {
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
