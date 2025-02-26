package function;
import java.util.Scanner;

public class paramters {
    public static int calculateSum(int a, int b) {
        
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.println("sum is :" + sum);

    }
}

// two types of parameters
// 1> formal params  or normal paramter used in defination
 
// 2> actual params or also called  arugments
// used for calling only

  