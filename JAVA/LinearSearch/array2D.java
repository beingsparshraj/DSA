import java.util.Arrays;

public class array2D {
    public static void main(String[] args) {

        int arr[][] = {
                { 23, 4, 1 },
                { 18, 15, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 15 }
        };

        int target = 34;
        // format of return value {row,col}
        int[] ans = search(arr, target);
        int[] max = maximum(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(maximum(arr));

    }

    public static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length - 1; row++) {
            for (int col = 0; col < arr.length - 1; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    // we can find maximum in 2D arrays

    public static int maximum(int[][] arr) {
        int maximum = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length - 1; row++) {
            for (int col = 0; col < arr.length - 1; col++) {
                if (arr[row][col] > maximum) {
                    maximum = arr[row][col];
                }
            }
        }
        return maximum;
    }
}
