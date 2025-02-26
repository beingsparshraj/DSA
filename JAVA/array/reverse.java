public class reverse {
    public static void reverse_array(int numbers[]) {
        // shuru se first index nikalte jaao aur last se then swap krdo 
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            // swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        reverse_array(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }  
        System.out.println();
    }
}
