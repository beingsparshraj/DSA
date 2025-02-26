public class addTwoMatrix {
    public static void main(String[] args) {
        // adding two matrix
        int[][] arr = {{1,2,8},{1,2,3},{1,2,3}};
        int[][] arr1 = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] arr2 = new int[arr.length][arr[0].length];

        int m = arr.length;
        int n = arr[0].length;

        for(int i=0;i<m;i++){
            for(int j=0; j<n;j++){
                arr2[i][j] = arr[i][j] + arr1[i][j]; 
                System.out.print(arr2[i][j] + " ");
            }   
            System.out.println();
        }
    }
}
