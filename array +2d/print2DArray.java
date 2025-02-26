public class print2DArray {
    public static void main(String[] args) {
        int[][] arr= {{10,10,10,10,10},{10,10,10,10,10},{10,10,10,10,10},{10,10,10,10,10},{10,10,10,10,10}};
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(10 + " ");
            }
            System.out.println();
        }

        for (int[] ele : arr) {
            System.out.print(ele);
        }
    }
}
