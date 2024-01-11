package DSA.ARRAY;

import java.util.Scanner;

public class CONTAINS_DUPLICATE {

    public static boolean containsDuplicate_Brute_Force(int arr[]) {

        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /*

    public static boolean ContainsDuplicate_Sort(int arr[]) {

        Arrays.sort(arr);
        int size = arr.length;

        for (int i = 0; i < size-1; i++) {
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//      int arr[]={1,1,1,3,3,4,3,2,4,2};
        int arr[] = {1, 2, 3, 4};

        containsDuplicate_Brute_Force(arr);
//        ContainsDuplicate_Sort(arr)

    }

}
