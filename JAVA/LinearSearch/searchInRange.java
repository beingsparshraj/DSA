public class searchInRange {
    public static void main(String[] args) {
        int[] nums = { 23, 45, -1, 2, 8, 19, -3, 16, -11, 25 };
        int target = -1;
        int ans = linearSearch(nums, target,1,4);
        System.out.println(ans);
    }

    // search the target and retrun the element
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int i = start; i < end; i++) {
            // check for element at every index if it is = target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        // search in the array: return the index if item found otherwise item not found

        // return -1;
        // or
        return Integer.MAX_VALUE;

        // static int linearSearch(int[] arr, int target) {
        // if (arr.length == 0) {
        // return -1;
        // }

        // // run a for loop
        // for (int i = 0; i < arr.length; i++) {
        // // check for element at every index if it is = target
        // int element = arr[i];
        // if (element == target) {
        // return i;
        // }
        // }

        // return -1;
        // this line will execute if none of the return statments above have executed
        // hence the tagret is not found
    }
}
