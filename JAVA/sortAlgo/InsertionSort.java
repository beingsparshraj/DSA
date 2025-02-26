public class InsertionSort {
    // pick an element from unsorted part and place in the right pos in sorted part
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        Insertion_Sort(arr);
        printNum(arr);

    }
    // inbuild sort
    // array.sort(arr,collections.reverseOrder())
    // yeh hamesha objects pr kaam krta hai 
    // 

    public static void Insertion_Sort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out the correct pos to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;

        }
    }

    public static void printNum(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println();
    }
}
