public class setRowZerow {
    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        System.out.println(arr[i][j]);

    }

    public void setZeroes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] helper = new int[m][n];
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;

                }
            }
        }
        // traverse the 0th row
        for(int j=1;j<n;j++){
            if(arr[0][j] ==0){
                for(int i=1; i<m; i++){
                    arr[i][j] = 0;
                }
            }
        }

        // traverse the 0th col
        for(int i=1;i<n;i++){
            if(arr[i][0] ==0){
                for(int j=1; j<m; j++){
                    arr[i][j] = 0;
                }
            }
        }

    }
}
