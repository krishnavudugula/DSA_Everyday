import java.util.*;
public class BuySellStocks {
    static int maxProfit(int[] prices){

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            if (price < minPrice){
            // If the current price is the lowest we've seen, update our buy price
            minPrice = price;   
            } else if (price - minPrice > maxProfit){
                // If selling today yields a higher profit, update our max profit
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        // int prices[] = {7,1,5,3,6,4};
        // int result = maxProfit(prices);
        // System.out.println(result);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] prices = new int[n];
        //input
        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        //output
        int result = maxProfit(prices);
        System.out.println(result);


    }
}