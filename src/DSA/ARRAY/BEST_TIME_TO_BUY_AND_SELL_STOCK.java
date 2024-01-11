package DSA.ARRAY;

import java.util.Scanner;

public class BEST_TIME_TO_BUY_AND_SELL_STOCK {
    public static int maxProfit(int[] prices) {

        int size=prices.length;

        int j=0,Profit_Price=0,Max_profit=0;

        for(int c=0;c<size-1;c++){
            if(prices[c]<prices[c+1]) {
                Profit_Price++;
            }
        }
        for(int i=0;i<size-1;i++){
            if(Profit_Price>0){
                if(prices[i]<prices[i+1] ){
                    Max_profit += prices[i+1]-prices[i];
                }
            }
            else{
                return 0;
            }
        }

        return Max_profit;
    }

    public static int maxProfit_1(int[] prices,int k) {

        int size=prices.length;

        int j=0,Profit_Price=0,Max_profit=0;

        for(int c=0;c<size-1;c++){
            if(prices[c]<prices[c+1]) {
                Profit_Price++;
            }
        }
        while(j<k*2){
            for(int i=j+1;i<k*2;i+=2){
                if(Profit_Price>0){
                    if(prices[j]<prices[i] ){
                        Max_profit += prices[i]-prices[j];
                    }
                    j+=2;
                }
                else{
                    return 0;
                }
            }
        }
        return Max_profit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int prices[]={334, 500, 169, 724, 478, 358, 962, 464, 705, 145, 281, 827, 961, 491, 995, 942, 827};
//        int k=2;
//        Expected Output=1643

        int prices[]={7,1,5,3,6,4};

        int result=maxProfit(prices);
//        int result_1=maxProfit_1(prices,k);
        System.out.println(result);


    /*

        Input: prices = [7,1,5,3,6,4]
        Output: 7
        Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
        Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
        Total profit is 4 + 3 = 7.

     */

    /*

        Input: prices = [1,2,3,4,5]
        Output: 4
        Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
        Total profit is 4.

     */

    /*

        Input: prices = [7,6,4,3,1]
        Output: 0
        Explanation: There is no way to make a positive profit, so we never buy the stock to
        achieve the maximum profit of 0.

     */


    }

}

