public class setRowColumnZero {
    public static void calu() {
        int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int m = arr.length;
        int n = arr[0].length;
        int[][] helper = new int[m][n];
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

       
        


    }
}

        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {
        // // making copy of arr
        // helper[i][j] = arr[i][j];

        // }
        // }

        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {
        // if(helper[i][j]==0){
        // // set the ith and jth col to 0 in arr
        // // set column
        // for(int b=0;b<n;b++){
        // arr[i][b] = 0;
        // }
        // // set row
        // for(int a=0;a<n;a++){
        // arr[a][j] = 0;
        // }
        // }
        // System.out.print(helper[i][j]+" ");

        // }
        // System.out.println();
        // }


        // method 2  using less space more optimized

 // for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // making copy of arr
                if (arr[i][j] == 0) {
                    // mark particular row and col
                    row[i] = true;
                    row[j] = true;

                }
            }
        }
// set the 'true' rows to 0

// for (int i = 0; i < m; i++) {
// if(row[i]==true)

// {
// // set ith col to 0
// for (int j = 0; j < n; j++) {
// arr[i][j] = 0;
// }
// }
// }

// for (int j = 0; j < m; j++) {
// if(col[j]==true){
// // set jth col to 0
// for(
// int i = 0;i<n;i++)
// {
// arr[i][j] = 0;
// }
// }}
