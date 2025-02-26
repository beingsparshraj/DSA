import java.lang.reflect.Array;

public class practiseArray {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 1, 0, 1, 1, 0 };
        // int[] arr1 = new int[arr.length];
        int n = arr.length;
        // int noOfZeroes = 0;
        // int noOfOnes = 0;
        // method 1
        // first calculate how many zeroes and one its have
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 0) {
        // noOfZeroes++;
        // }
        // }
        // number of Ones calculate krne ki zarurat hai hee nhi (total - noOfZeroes) kr
        // de toh
        // for (int i = 0; i <= arr.length; i++) {
        // if (arr[i] == 1) {
        // noOfOnes++;
        // }
        // }
        // for (int i = 0; i < arr.length; i++) {
        // if (i < noOfZeroes) {
        // arr[i] = 0;
        // } else {
        // arr[i] = 1;
        // }
        // }

        // method 2 using 2 pointers

        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (arr[i] == 0) {

                i++;

            } else if (arr[j] == 1) {
                j--;

            } else if ((arr[i] == 1 && arr[j] == 0)) {
                // swap
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;

            }

        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

}
