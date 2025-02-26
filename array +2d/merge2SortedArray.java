public class merge2SortedArray {
    public static void main(String[] args) {

        // algo

        // while (i < a.length && j < b.length) {
        // if (a[i] <= b[j]) {
        // c[k] = a[i];
        // i++;
        // k++;
        // } else {
        // c[k] = b[j];
        // j++;
        // k++;
        // }
        // }
        // if(i==a.length){
        // while(j<b.length){
        // c[k] = b[j];
        // j++; k++;
        // }
        // }

        // if(j==b.length){
        // while(j<b.length){
        // c[k] = b[j];
        // j++; k++;
        // }
        // }

        int[] a = { 11, 33, 42, 71 };
        int[] b = { 26, 54, 69, 81 };
        int m = a.length, n = b.length;
        int[] c = new int[m + n];

        int i = 0, j = 0, k = i + j;

        while (i < m && j < n) {
            if (a[i] <= b[j]) {
                b[i] = c[k];
                i--;
                k--;
            } else {
                b[j] = c[k];
                j--;
                k--;
            }
        }

        for (int ele : c) {
            System.out.print(ele + " ");
        }

    }
}
