// package sortAlgo;

public class bubbleSort {

    public static void bubble_sort(int numbers[]) {
        // for number of turns
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

   
    public static void printNum(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers[] = { 5, 4, 1, 3, 2 };
        bubble_sort(numbers);
        printNum(numbers);
    }
}
