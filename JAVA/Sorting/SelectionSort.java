public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 10, -4, 20, 1, 8, 6 };
        // pure array mai sabse chota array
        // for selection sort
        int n = arr.length;
        print(arr);
        for (int i = 0; i < n-1; i++) {
            int mindx = -1;
            int min = Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min =arr[j];
                    mindx = j;
                }
            }
            // swap arr[i] and arr[mindx]
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx]  = temp;
        }
        print(arr);
    }

    public static void print(int[] arr) {
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
