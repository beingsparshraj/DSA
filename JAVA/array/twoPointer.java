public class twoPointer {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        // for(int ele : arr){
        //     System.out.println(ele + " ");
        // }
        // two pointers
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            swap(arr,i, j);
            i++;
            j--;

        }

        for(int ele : arr){
            System.out.println(ele + " ");
        }

       
       
         
    }

    public static void swap(int[] arr,int i,int j) {
        int temp=  arr[i];
        arr[i]=  arr[j];
        arr[j]= temp;
    }
}
