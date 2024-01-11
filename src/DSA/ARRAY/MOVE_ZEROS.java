package DSA.ARRAY;

import java.util.Scanner;

public class MOVE_ZEROS {

    public static void moveZeroes(int[] nums) {
        int size=nums.length;

        int j=0;
        while(j<size) {


            for (int i = 0; i < size - 1; i++) {

                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }

            }
            j++;
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nums[]={0,1,0,3,12};

        moveZeroes(nums);

    }

}
