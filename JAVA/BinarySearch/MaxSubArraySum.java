public class MaxSubArraySum {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        maxSubArraySum(arr);
    }

    public static int maxSubArraySum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                int end = j;
                for (int k = start; k <= end; k++) {
                    // subarray ka sum
                    // currSum = curSum + arr[k];
                    currSum += arr[k];

                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }
            System.out.println("max sum" + ": " + maxSum);
        }
        return -1;

    }
}
