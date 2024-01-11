package DSA.ARRAY;

import java.util.Scanner;

public class GET_DISCOUNT_PAIRS {

    public static int getDiscountPairs(int x,int prices[]){

        int size = prices.length;
        int sum =0;
        int count = 0;

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                sum = prices[i]+prices[j];
                if(sum % x == 0){
                    count++;
                }
            }
            sum=0;
        }
        return count;
    }

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

//        int x = 10;
//        int prices[] = {3,7,27,23};

        int x = 60;
        int prices[] = {31,25,85,29,35};

        int result = getDiscountPairs(x,prices);
        System.out.println(result);

    }

    /*

        Amazon is offering a discount on every purchase of a pair of products whose price
        sum is divisible by x. Given the price of n products in the store, find the number
        of pairs (i,j) where i < j and prices[i] + prices[j] divisible by x.

        Example 1:

            n = 5 products, x = 60 and price = [31,25,85,29,35]

            The answer is 3 based on the pairs (31,29), (25,35), and (85,35).
            Each pair sums to a number divisible by x.

        Example 2:

            n = 4 products, x = 10 and price = [3,7,27,23]

            The answer is 4 based on the pairs (3,7), (3,27), (23,7), and (23,27).
            Each pair sums to a number divisible by x.


     */

}




