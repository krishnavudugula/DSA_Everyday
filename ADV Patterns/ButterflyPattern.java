public class ButterflyPattern {
    public static void main(String[] args) {
        
        int n = 5;

        //Upper Half
        for(int i=1; i<=n; i++){
            //1st half
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //2nd half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            //1st half
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //2nd half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}