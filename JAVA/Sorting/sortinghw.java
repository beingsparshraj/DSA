import java.lang.reflect.Array;

public class sortinghw {
    public static void main(String[] args) {
        // given an array with n distinct elements, covert the given array to a form where all elements are in the range from 0 to n-1. the order of elements is the same i.e 0 is placed in place of the smallest element,1 is placed for the second smallest elemnt n-1 is placed for the largest element.
        int[] arr = {54,11,28,57,91,63};
        int[] arr1 = {}; 
        // using bubble sort first sort it...
        int n = arr.length;
        int index = -1;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, i, j);
                    index = j;
                    
                    System.out.print(index  + " ");
                }
            }
        }
        System.out.println();
        print(arr);
    }
    
    public static void swap(int[] arr,int i, int j) {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
