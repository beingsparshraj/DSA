public class pairs {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 18 };
        pairs(arr);
    }

    public static void pairs(int arr[]) {
        // we can also find total number of pairs
        // also we can find the formula n(n-1)/2
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + current + "," + arr[j] + ")");
                totalPairs++;
            }
            System.out.println();

        }
        System.out.println("total Pairs :" + totalPairs);
    }
}
