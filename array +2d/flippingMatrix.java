public class flippingMatrix {
    
    public int matrixScore(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        // for (int i = 0; i < m; i++) {
        // // flip the row
        // if (arr[i][0] == 0) {
        // for (int j = 0; j < n; j++) {
        // if (arr[i][j] == 0) {
        // arr[i][j] = 1;
        // } else
        // arr[i][j] = 0;
        // }
        // }
        // }
        // flip those columns where (no of 0s > no of 1s )
        // for (int j = 1; j < n; j++) {
        // int noOfZeroes = 0, noOfOnes = 0;
        // for (int i = 0; i < m; i++) {
        // if (arr[i][j] == 0)
        // noOfZeroes++;
        // else
        // noOfOnes++;
        // }
        // if (noOfZeroes > noOfOnes) {
        // for (int i = 0; i < m; i++) {
        // if (arr[i][j] == 0)
        // arr[i][j] = 1;
        // else
        // arr[i][j] = 0;
        // }
        // }
        // }
        for (int i = 0; i < m; i++) {
            // put 1 at the 0th position of every row
            if (arr[i][0] == 0) {
                // flip the row jaha jaha 0 hai
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 0;
                    }
                }
            }
        }
        // hame kisko flip krna hai
        // jismai maximum no. of zeroes ho
        // no of zeroes > no of ones
        int noOfZeroes = 0;
        int noOfOnes = 0;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (arr[j][0] == 0) {
                    noOfZeroes++;
                } else
                    noOfOnes++;
            }
            // flip the column
            if (noOfZeroes > noOfOnes) {
                for (int i = 0; i < m; i++) {
                    if (arr[i][j] == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 0;
                    }

                }
            }
        }

        // calculation of sum
        int score = 0;
        int x = 1;
        for (int j = n - 1; j < n; j++) {
            for (int i = 0; i < m; i++) {
                score += (arr[i][j] * x);
            }
            x += 2;
        }

        return score;
    }
}
