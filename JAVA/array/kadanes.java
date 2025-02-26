
public class kadanes {
    public static void kadanes_maxSub(int numbers[]) {
        int cs = 0;
        int ms = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
            if (ms < cs) {
                ms = cs;
            }
        }
        System.out.println("our max subarray sum is : " + ms);
        System.out.println("our current subarray sum is : " + cs);

    }

    // for -ve function

    public static int kandaneModify(int numbers[]) {
        int cs = numbers[0];
        int ms = numbers[0];
        for (int i = 1; i < numbers.length; i++) {

            cs = Math.max(numbers[i], cs + numbers[i]);
            ms = Math.max(ms, cs);
        }

        return ms;
 
    }

    public static void main(String[] args) {
        int numbers[] = { -1, -2, -3, -4 };
        kandaneModify(numbers);
        System.out.println("Maximum Subarray when all elements are negative : " + kandaneModify(numbers));
    }
}
