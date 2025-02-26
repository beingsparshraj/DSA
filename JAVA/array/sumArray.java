public class sumArray {
    public static void main(String[] args) {
        int[] arr = {2,2,7,2};
        int x = 9;

        for(int i=0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i] + "and" + arr[j]);
                }
            }
        }
    }
}
