public class printRowMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,8},{1,2,3},{1,2,3}};

        int m = arr.length;
        int n = arr[0].length;
        int sum =0;
        for(int i=0;i<m;i++){
            for(int j = 0; j<n;j++){
                 sum += arr[i][j];
               }

               System.out.println();
        }
        for(int[] ele : arr){
            System.out.print(sum + " ");
        }
    }
}
