public class lowerAndUpperBound {
    public static void main(String[] args) {
        // lower bound and upper bound
        int[] arr = {10,23,46,46,91,97,140,264};
        int n = arr.length;
        int target = 46;
        int lb = n;
        int lo =0; int hi =n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>=target){
                lb = Math.min(lb, mid);
                hi = mid -1;
            }else{
                lo = mid + 1;
            }
        }
        System.out.println(lb);
    }

    // upper bound

    // int[] arr = {10,23,46,46,91,97,140,264};
    //     int n = arr.length;
    //     int target = 46;
    //     int lb = n;
    //     int lo =0; int hi =n-1;
    //     while(lo<=hi){
    //         int mid = (lo+hi)/2;
    //         if(arr[mid]>=target){
    //             lb = Math.min(lb, mid);
    //             hi = mid -1;
    //         }else{
    //             lo = mid + 1;
    //         }
    //     }
    //     System.out.println(lb);
    // }
}
