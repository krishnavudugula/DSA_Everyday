import java.util.*;
public class BuySellStocks2 {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
                maxProfit += prices[i] - prices[i-1]; 
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];

        //input
        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }

        System.out.println(maxProfit(prices));


    }
    
}
