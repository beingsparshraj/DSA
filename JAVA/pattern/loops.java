package pattern;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("enter your number");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum = evenSum + number;
            } else {
                oddSum = oddSum + number;
            }
            System.out.println("do you want to continue press 1 for YES and presss 0 for NO");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("sum of even number" + evenSum);
        System.out.println("sum of odd numbers" + oddSum);

    }

}