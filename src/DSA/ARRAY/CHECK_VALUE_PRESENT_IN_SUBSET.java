package DSA.ARRAY;

import java.util.Scanner;

public class CHECK_VALUE_PRESENT_IN_SUBSET {

    public static void main(String []args){

        /*
            Given an array of integers with size 'num' & another number 'num2'.
            Also given a size 'S'(integer value) of the subset. The task is to find
            if the number 'num2' is present in every non-overlapping subset of size
            'S' in the given array. If its present in every subset print 1 otherwise
            print 0.

            Input -
            12 (size/num)
            20  1  6  8  13  20  1  7  20  13  16  20
            <------>  <------>   <------>   <------>
               20        20         20         20   ----> present i.e print 1

            20 (num2)
            3  (subset)

            Output -
            1

            ---------------------------------------------------------------

            Input -
            10 (size/num)
            8  5  3  6  9  2  3  1  9  8
            <----->  <----->  <----->
               5        X        5       --> But one subset 5 is not-present i.e print 0

            5 (num2)
            3 (subset)

            Output -
            0

         */



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array !!!");
        int size = sc.nextInt();

        int []arr = new int[size];

        System.out.println("Enter the Elements ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to check in Array-List");
        int num = sc.nextInt();

        System.out.println("Enter the Subset size :");
        int S = sc.nextInt();

        boolean found = false;

        for(int i=0; i<size; i += S){

            found = false;

            for(int j=i; j<i+S && j<size; j++){
                if(arr[j]==num){
                    found=true;
                }
            }
            if(found){
                continue;
            }
            else {
                System.out.println(0);
                System.exit(0);
            }
        }
        System.out.println(1);
    }

}
