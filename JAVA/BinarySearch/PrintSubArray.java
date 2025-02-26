public class PrintSubArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        PrintSubArrays(arr);
    }

    public static int PrintSubArrays(int arr[]) {

        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            int start = i;
            int current = arr[i];
            for (int j = i; j < arr.length - 1; j++) {
                int sum = arr[j];
                int end = j;
                for (int k = start; k <= end; k++) {
                    for (int l = start; l <= end; l++){
                        // System.out.println("(" + current + "," + arr[j] + ")");
                        System.out.print(arr[l] + " ");

                    }
                }
                System.out.println();

            }
            System.out.println();
        }
        return -1;

    }
}
