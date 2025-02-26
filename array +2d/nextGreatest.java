public class nextGreatest {
    public static void main(String[] args) {
        int[] arr = { 12, 8, 41, 37, 2, 49, 16, 28, 21 };
        int[] ans = new int[arr.length];
        ans[arr.length - 1] = -1;
        // brute Force method 1
        for (int i = 0; i <= arr.length - 1; i++) {
            int mx = Integer.MIN_VALUE;
            for (int j = i + 1; j < arr.length; j++) {
                mx = Math.max(mx, arr[j]);
            }
            ans[i] = mx;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        for (int ele : ans) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
