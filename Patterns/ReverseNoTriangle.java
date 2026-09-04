// public class ReverseNoTriangle {
//     public static void main(String[] args) {
//         int n=5;
//         int count=5;
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print(count + " ");
//                 count--;
//             }
//             count=5;                //Doubt
//             System.out.println();
//         }
//     }
// }


public class ReverseNoTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > n - i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
