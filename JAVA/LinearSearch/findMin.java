public class findMin {
    public static void main(String[] args) {
        int[] arr = { 23, -45, -1, 2, 8, 19, -3, 16, -11, 25 };
        System.out.println(min(arr));
    }

    // assume arr.length !=0
    // return the minimum value in the array
    public static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i <= arr.length ; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
