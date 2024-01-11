package DSA.ARRAY;

import java.util.Scanner;

public class INSERTION_SORT {

    public static void display(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void insertion_Sort(int arr[],int size){
        int j;
        for(int i=1;i<size;i++){
            int temp=arr[i];
            j=i;
            while (j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

/*      Time Complexity = Worst Case = O(n^2)
                        = Average Case = O(n^2)
                        = Best Case = O(n)
 */

        int arr[]={12,11,13,5,6};
        int size=arr.length;

        display(arr,size);

        insertion_Sort(arr,size);

        display(arr,size);

    }

}
