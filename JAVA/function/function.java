package function;
import java.util.Scanner;

// public class function {
//     public static void main(String[] args) {

//     }

// }

// parameter V/S argument
// formal params main defination

// parameter is basically input
public static int calculateSum(int num1, int num2) {
    int sum = num1 + num2;
    return sum;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    //  argument or actual paramter
    int sum = calculateSum(a, b); 
    System.out.println("sum is :" + sum);
}