package DSA.ARRAY;

import java.util.Scanner;

public class SELECTION_SORT {

    public static void display(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void selection_Sort(int arr[],int size){
        int min= Integer.MAX_VALUE,minIndex=0;
        int j=0;
        while (j<size){
            for(int i=j;i<size;i++){
                if(arr[i]<min){
                    min=arr[i];
                    minIndex=i;
                }
            }
            int temp;
            temp=arr[j];
            arr[j]=arr[minIndex];
            arr[minIndex]=temp;

            min= Integer.MAX_VALUE;
            j++;
        }
    }

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

//      Time Complexity = O(n^2)

        int arr[]={64,25,1,22,11,5,15,1};
        int size=arr.length;

        display(arr,size);

        selection_Sort(arr,size);

        display(arr,size);

    }

}
