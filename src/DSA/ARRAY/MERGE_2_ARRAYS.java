package DSA.ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class MERGE_2_ARRAYS {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int size = n+m;

        int op[]=new int[size];

        if(m!=0){
            for (int i = 0; i < m; i++) {
                op[i] = nums1[i];
            }
        }

        if(n!=0){
            for (int j = 0; j < n; j++) {
                op[m + j] = nums2[j];
            }
        }


        Arrays.sort(op);
        System.out.println(Arrays.toString(op));


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = 0;
        int nums1[] = {0};
        int n = 1;
        int nums2[] = {1};

        merge(nums1,m,nums2,n);


        /*

        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]
        Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
        The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
        Example 2:

        Input: nums1 = [1], m = 1, nums2 = [], n = 0
        Output: [1]
        Explanation: The arrays we are merging are [1] and [].
        The result of the merge is [1].
        Example 3:

        Input: nums1 = [0], m = 0, nums2 = [1], n = 1
        Output: [1]
        Explanation: The arrays we are merging are [] and [1].
        The result of the merge is [1].
        Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure
        the merge result can fit in nums1.

         */

    }

}
