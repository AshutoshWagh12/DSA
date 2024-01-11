package DSA.ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class MEDIAN_SORTED_ARRAYS {

    public static double findMedianSortedArrays(int []nums1, int []nums2){

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int size=nums1.length+nums2.length;

        int[]arr=new int [size];
        //take 3 pointers
        int i=0;
        int j=0;
        int k=0;

        while (i<nums1.length && j<nums2.length)
        {
            if (nums1[i]<nums2[j])
            {
                //if the element at i is smaller it will be added first
                arr[k]=nums1[i];
                i++;
            }
            else
            {
                arr[k]=nums2[j];
                j++;
            }
            k++;
        }

        //now check if there are element left in the any of the array
        while(i<nums1.length)
        {
            arr[k]=nums1[i];
            i++;
            k++;
        }

        while(j<nums2.length)
        {
            arr[k]=nums2[j];
            j++;
            k++;
        }

        // Find Median

        if (arr.length%2==0)
        {
            return (float) (arr[size/2]+arr[size/2-1])/2;
        }
        return  arr[arr.length/2];

    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int num1[]={1,2};
        int num2[]={3,4};

        double res = findMedianSortedArrays(num1,num2);
        System.out.println(res);

        /*

        Example 1:

        Input: nums1 = [1,3], nums2 = [2]
        Output: 2.00000
        Explanation: merged array = [1,2,3] and median is 2.

        Example 2:

        Input: nums1 = [1,2], nums2 = [3,4]
        Output: 2.50000
        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

         */

    }

}
