import java.util.Scanner;

public class array2D {
    // pahle maximum colm ka data lete hai then row pr shift hote hai

    public static boolean search(int matrix[][], int key) {

        int m = matrix[0].length;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        // matrix ki total no. of rows
        int n = matrix.length;
        // matrxi ki total no, of columns
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }
        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

            search(matrix, 5);

        }
    }

    // in 2d-array data phele usually row wise atta hai then column wise
}