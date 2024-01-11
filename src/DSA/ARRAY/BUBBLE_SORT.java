package DSA.ARRAY;

import java.util.Scanner;

public class BUBBLE_SORT {

    public static void display(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void bubble_Sort(int arr[],int size){
        int j=0;
        while(j<size){
            for(int i=0;i<size-1;i++){
                int temp;
                if(arr[i]>arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            j++;
        }
    }

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

//      Time Complexity = O(n^2)

        int arr[]={8,1,2,6,1};

        int size=arr.length;

        display(arr,size);

        bubble_Sort(arr,size);

        display(arr,size);

    }

}
