package DSA.ARRAY;

import java.util.Scanner;

public class SQUARES_OF_SORTED_ARRAY {

    public static int[] sortedSquares(int[] nums) {
        int size=nums.length;

        int op[]=new int[size];

        for(int i=0;i<size;i++){
            op[i]=Math.abs(nums[i]*nums[i]);
        }

        for(int m=0;m<size;m++){
            for(int j=0;j<size-1;j++){
                if(op[j]>op[j+1]){
                    int temp=op[j];
                    op[j]=op[j+1];
                    op[j+1]=temp;
                }
            }
        }
        return op;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nums[]={-4,-1,0,3,10};

        sortedSquares(nums);



        /*

        Example 1:

        Input: nums = [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
        Explanation: After squaring, the array becomes [16,1,0,9,100].
        After sorting, it becomes [0,1,9,16,100].
        Example 2:

        Input: nums = [-7,-3,2,3,11]
        Output: [4,9,9,49,121]

         */

    }

}
