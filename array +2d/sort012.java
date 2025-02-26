public class sort012 {
    public static void main(String[] args) {

        // sort colours

        int arr[] = { 0, 1, 0, 1, 2, 0, 2, 1, 1, 0, 2 };
        int n = arr.length;
        int noOfZeroes = 0;
        int noOfOnes = 0;

        // method 1
        // for (int i = 0; i < n; i++) {
        // if (arr[i] == 0)
        // noOfZeroes++;
        // if (arr[i] == 1)
        // noOfOnes++;
        // }
        // for (int i = 0; i < n; i++) {
        // if (i < noOfZeroes)
        // arr[i] = 0;
        // else if (i < noOfZeroes + noOfOnes)
        // arr[i] = 1;
        // else
        // arr[i] = 2;
        // }

        // again

        // for (int i = 0; i < n; i++) {
        //     if (arr[i] == 0) {
        //         noOfZeroes++;
        //     }
        //     if (arr[i] == 1) {
        //         noOfOnes++;
        //     }
        // }

        // for (int i = 0; i < n; i++) {
        //     if (i < noOfZeroes) {
        //         arr[i] = 0;
        //     } else if (i < noOfZeroes + noOfOnes) {
        //         arr[i] = 1;
        //     } else {
        //         arr[i] = 2;
        //     }
        // }

        // dutch flag algo
        // three pointer approch low,mid,high

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
