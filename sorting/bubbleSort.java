package bubbleSort;
import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        // method 1
        // we can use buildin Sort method
        int[] arr = {7,-5,1,6};
        for(int ele:arr){
            System.out.print(ele + " ");
        }System.out.println();
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
