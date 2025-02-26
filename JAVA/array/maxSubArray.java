public class maxSubArray {

    public static void maxsub(int numbers[]) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = 1; j < numbers.length; j++) {
                currSum = 0;
                int end = j;
                for (int k = start; k <= end; k++) {
                    // subarray sum
                    currSum += numbers[k];
                    // System.out.print(numbers[k] + " ");
                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                System.out.println("total sum of sub array[k] = " + currSum);

                ts++;
                // System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sum = " + ts);
        System.out.println("total sum = " + maxSum);


    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxsub(numbers);

    }
}
