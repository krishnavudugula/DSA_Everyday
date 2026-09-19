import java.util.*;
//Max Sales in K Consecutive Days - Sliding Windows
public class MaxmSalesinK {
    public static int maxSales(int[] sales, int k){
        int currentSum = 0;
        int maxSum = 0;
        //first k values (Sum)
        for(int i=0; i<k; i++){
            currentSum += sales[i];
        }
        maxSum = currentSum;
        //Next k values (sum) - comparing them with previous k values - Sliding
        for(int i=k; i<sales.length; i++){
            currentSum = currentSum - sales[i-k] + sales[i];
            maxSum = Math.max(currentSum, maxSum);
        }
        return  maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] sales = new int[m];

        for(int i=0; i<m; i++){
            sales[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(maxSales(sales, k));

    }
}
