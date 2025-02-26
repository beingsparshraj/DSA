class binarySearch {
    public static void main(String[] args) {
        // what is binary Search ??
        // 1> it is very very efficient
        // it is used to search a given elemnt in a sorted space(array)
        // it is used to reduce the search space in half after every turn
        // usually we apply binary search it is given that it is sorted array
        // linear search ki T(c) = O(n);
        // suppose you have sorted array
        // algo binary
        // reduced space searched by half
        // if(arr[min]<target) go right
        // if(arr[min]>target) go left
        // if(arr[min]==target) done♥
        // T(C) = n*log2(n)

        int[] arr = { 10, 23, 46, 89, 91, 97, 107, 140, 264 };
        int n = arr.length;
        int target = 46;
        int lo = 0, hi = n - 1;
        // false means not present
        boolean flag = false;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (arr[mid] > target) {
                // go left
                hi = mid - 1;
            } else if (arr[mid] < target) {
                // go right
                lo = lo + 1;
            }
            // O(log2n)>>>O(n) > o(n2) much better time complexity
        }
        if(flag == true) System.out.println("target found");
        else System.out.println("target not found");
    }
}