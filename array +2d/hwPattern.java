import java.util.Scanner;

public class hwPattern {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter a number:-");
        // int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n-i+1; j++) {
        // System.out.print((char)(j+64));
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print((char)(j+64));
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // if(i%2==0){
        // System.out.print((char)(j+64));
        // }else{
        // System.out.print(j);
        // }
        // }
        // System.out.println();
        // }
        // }

        // for (int i = 1; i <= n; i++) {

        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");

        //     }
        //     System.out.println();

        // }

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i ; j++) {
        //         System.out.print("*");

        //     }
        //     System.out.println();

        // }


        int n = 4;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
