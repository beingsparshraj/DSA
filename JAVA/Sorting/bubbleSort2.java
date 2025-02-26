package bubbleSort;

public class bubbleSort2 {
    // swapping
    // arr[i]>arr[i+1]
    public static void main(String[] args) {
        int[] arr =  {5,1,3,4,2};
        int n = arr.length;
        print(arr);
        // pata kiase chalega ki kitni bar loop lagega 
        // so haam worst case lenge
        // n-1 passes
       for(int x= 0; x<=n-1;x++){

        // for(int i=0;i<n-1;i++){
        //     if(arr[i]>arr[i+1]){
        //         int temp = arr[i];
        //         arr[i]=arr[i+1];
        //         arr[i+1]=temp;
        //     }
        // }
       
        // more optimize

        for(int i=0;i<n-1-x;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            
        }

        //    check if this pass has sorted or not
        boolean flag = true;
        for(int i =0;i<n-1-x;i++){
            if(arr[i]>arr[i+1]){
                flag = false;
                break;
            }
        }
        if(flag==true){
            break;
        }
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
