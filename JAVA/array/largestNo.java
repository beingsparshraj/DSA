
public class largestNo {

    public static int getLargest(int numbers[]) {
        // min_value lowest value or -infinity
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i <= numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];

            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }

        }
        return largest;
    }

    public static void main(String[] args) {
        // find largest number in a given array
        int numbers[] = { 1, 2, 6, 3, 5 };
        System.out.println("largest value is : " + getLargest(numbers));

    }
}
