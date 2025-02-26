public class largestElement2DArray {
    // largest element in 2D Array

    public static void main(String[] args) {
        // adding two matrix
        int[][] arr = {{1,2,8},{1,2,3},{1,2,3}};

        int m = arr.length;
        int n = arr[0].length;
        int maxElement = Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0; j<n;j++){
                if(arr[i][j]> maxElement  ){
                    maxElement = arr[i][j];
                    System.out.println(maxElement);
                }
            }   
            System.out.println();
        }
    }
    

}
