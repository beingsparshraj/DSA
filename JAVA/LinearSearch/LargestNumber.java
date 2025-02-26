public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6,0 };
        System.out.println("largest value is " + largest(arr));

        System.out.println("smallest value is : " + smallest(arr));

    }

    // largest valvue
    public static int largest(int arr[]) {
        // -infinity lowest possible value
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    // smallest value
    public static int smallest(int arr[]) {
        //
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

}
