import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        
        int n = sb.length()-1;
        reverse(sb, 0, n);
        System.out.println(sb);
    }
    

    public static void reverse(StringBuilder sb,int i,int j) {
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j)); 
            sb.setCharAt(j,temp); 
            i++;j--;

        }
    }
}
