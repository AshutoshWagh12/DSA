package DSA.ARRAY;

import java.util.Scanner;

public class MAX_DIFFERENCE {

    public static int maxDifference(int nums[],int size){

        int maxSum = 0,Price=0;

        for(int index=0;index<size-1;index++){
            if(nums[index]<nums[index+1]) {
                Price++;
            }
        }

        if(Price>0){
            for(int i=0;i<size;i++){
                for(int j=0;j<i;j++){
                    if(nums[j]<nums[i]){
                        int currentSum = nums[i]-nums[j];
                        if(currentSum>maxSum){
                            maxSum=currentSum;
                        }
                    }
                }
            }
        }
        else{
            return -1;
        }



        return maxSum;

    }

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

//        int []nums ={2,3,10,2,4,8,1};
        int []nums ={7,1,2,5};
//        int []nums ={7,5,3,1};
        int size = nums.length;

        int result = maxDifference(nums,size);
        System.out.println(result);


        /*

        p[7,5,3,1]
        if array is like descending order then return -1

        else

        p[2,3,10,2,4,8,1]

        - There is no predecessor for the first quote.
        - At the 2nd quote, the price is higher than the 1st quote:
                        p[1] - p[0] = 3 - 2 = 1
        - At the 3rd quote, the price is higher than the 1st
          and 2nd quotes:
                        p[2] - p[1] = 10 - 3 = 7
                        p[2] - p[0] = 10 - 2 = 8
        - At the 5th quote, the price is higher than the 1st
          and 2nd quotes:
                        p[4] - p[1] = 4 - 3 = 1
                        p[4] - p[0] = 4 - 2 = 2
        - At the 6th quote, the price is higher than the 1st,
          2nd, 4th and 5th quotes:
                        p[5] - p[0] = 8 - 2 = 6
                        p[5] - p[1] = 8 - 3 = 5
                        p[5] - p[3] = 8 - 2 = 6
                        p[5] - p[4] = 8 - 4 = 4

         => The maximum difference is 8

         */

    }

}
