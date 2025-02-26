public class twoPointer {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        int n = arr.length;
        // for (int ele : arr) {
        //     System.out.print(ele + " ");
        // }
        // System.out.println();
        // // reverse

        // for (int i = 0; i < n/2; i++) {
        //     int j = n - i - 1;
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        // }

     

        // using two pointers

        int i=0, j = n-1;
        while (i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;

        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

    }

}
