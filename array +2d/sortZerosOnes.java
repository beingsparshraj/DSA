public class sortZerosOnes {
    public static void main(String[] args) {
        int arr[] = { 0,1,0,1,0,0,1,1,1,0,1 };
        int n = arr.length;
        int noOfZeroes = 0;
        int noOfOnes = 0;
        // for (int i = 0; i < n; i++) {
        // if (arr[i] == 0) {
        // noOfZeroes++;
        // } else {
        // noOfOnes++;
        // }
        // }
        // for (int i = 0; i < noOfZeroes; i++) {
        // arr[i] = 0;
        // }
        // for (int i = noOfZeroes; i < n; i++) {
        // arr[i] = 1;
        // }

        // or

        // for (int i = 0; i < n; i++) {
        // if (i < noOfZeroes) {
        // arr[i] = 0;
        // } else {
        // arr[i] = 1;
        // }
        // }

        // using two pointer method 2

        // one pass soluiton

        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            }
            // if (i > j) {
            // break;
            // }
            else if (arr[i] == 1 && arr[j] == 0) {
                // pura swap knre ka code likhne ka zururat nhi ahi
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
