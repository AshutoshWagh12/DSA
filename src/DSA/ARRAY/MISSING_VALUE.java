package DSA.ARRAY;

import java.util.Scanner;

public class MISSING_VALUE {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int arr[]={1,2,3,5,6,7,8};
        int size=arr.length;
        int expected_size=arr.length+1;
        int Total_Sum_of_Expected_Array = (expected_size*(expected_size+1))/2;

        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        int missing_value=Total_Sum_of_Expected_Array-sum;
        System.out.println("The Missing Value in an Array is : "+missing_value);


    }

}
