public class pattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j);

            }
            for (int a = 1; a <= n-i+1; a++) {
                for(int b = 1; b<=i; b++){
                    System.out.print("*");
                }
                for(int c=1; c<=n;c++){
                    for(int d=1; d<=n-1;)
                }
            }

            
            System.out.println();
        }
    }
}
