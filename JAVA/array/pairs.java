public class pairs {

    public static void main(String[] args) {
        // pairs in an array
        int numbers[] = { 2, 4, 6, 8, 10 };

        pairsh(numbers);
    }

    public static void pairsh(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + current + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs" + ":" + tp);
    }
}
