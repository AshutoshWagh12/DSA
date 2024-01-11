package DSA.ARRAY;

import java.util.Scanner;

public class TWO_SUM {

    public static int[] twoSum(int[] nums, int target) {
        int size=nums.length;

        int i=0;

        int op[]=new int[2];

        while(i<size){
            for(int j=i+1;j<size;j++){
                if((nums[i]+nums[j])==target){
                    op[0]=i;
                    op[1]=j;
                    break;
                }
            }
            i++;
        }
        return op;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        int nums[] = {3,2,4};
        int target=6;

        twoSum(nums,target);

        /*

            Example 1:

            Input: nums = [2,7,11,15], target = 9
            Output: [0,1]
            Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
            Example 2:

            Input: nums = [3,2,4], target = 6
            Output: [1,2]
            Example 3:

            Input: nums = [3,3], target = 6
            Output: [0,1]

         */


    }

}
