public class RepeatedDecNo {
    public static void main(String[] args) {
        int n=5;
        int count = 1;
        for(int i=n;i>=1;i--){
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                
            }
            System.out.println();
        }
    }
}
