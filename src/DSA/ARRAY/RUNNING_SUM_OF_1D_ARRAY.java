package DSA.ARRAY;

import java.util.Scanner;

public class RUNNING_SUM_OF_1D_ARRAY {

    public static int[] runningSum(int []nums){
        int size=nums.length;

        int sum[]=new int[size];

        sum[0]=nums[0];

        for(int i=1;i<size;i++){
            sum[i] = sum[i-1]+nums[i];
        }
        return sum;
    }


    /*

        public static void Sum(int nums[]){

        int size = nums.length;

        int op[]=new int[size];

        op[0]= nums[0];

        int sss=0;
        for(int i=1;i<size;i++){
            for(int j=0;j<=i;j++){
                sss += nums[j];
            }
            op[i] = sss;
            sss=0;
        }
        System.out.println(op);

    }

     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nums[] = {1,2,3,4};

        int d[]=runningSum(nums);
        System.out.println(d);

        /*

            Input: nums = [1,2,3,4]
            Output: [1,3,6,10]
            Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

         */

        /*

            Input: nums = [1,1,1,1,1]
            Output: [1,2,3,4,5]
            Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

         */

        /*

            Input: nums = [3,1,2,10,1]
            Output: [3,4,6,16,17]

         */

    }

}
