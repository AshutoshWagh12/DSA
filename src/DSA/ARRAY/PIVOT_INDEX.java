package DSA.ARRAY;

import java.util.Scanner;

public class PIVOT_INDEX {

    public static int pivotIndex(int[] nums) {
        int size=nums.length;

        int Left_Sum=0, Righ_Sum=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<i;j++){
                Left_Sum += nums[j];
            }
            for(int k=i+1;k<size;k++){
                Righ_Sum += nums[k];
            }

            if(Left_Sum==Righ_Sum){
                return i;
            }

            Left_Sum =0; Righ_Sum=0;
        }
        return -1;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nums[]={1,7,3,6,5,6};


        /*
            int nums[]={1,7,3,6,5,6};
            Output: 3
            Explanation:
            The pivot index is 3.
            Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
            Right sum = nums[4] + nums[5] = 5 + 6 = 11

         */

        /*
            Input: nums = [1,2,3]
            Output: -1
            Explanation:
            There is no index that satisfies the conditions in the problem statement.

         */

        /*
            Input: nums = [2,1,-1]
            Output: 0
            Explanation:
            The pivot index is 0.
            Left sum = 0 (no elements to the left of index 0)
            Right sum = nums[1] + nums[2] = 1 + -1 = 0


            Input: nums = [-1,-1,-1,-1,-1,-1]
            Output: -1

            Input: nums = [-1,-1,-1,-1,-1,0]
            Output: 2

         */


        int s=pivotIndex(nums);
        System.out.println(s);

    }

}
