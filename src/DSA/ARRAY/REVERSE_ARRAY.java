package DSA.ARRAY;

import java.util.Scanner;

public class REVERSE_ARRAY {

    public static void display(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverse(int arr[],int start,int size){

        while (start<size){
            int temp=arr[start];
            arr[start]=arr[size-1];
            arr[size-1]=temp;
            start++;
            size--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[]={1,2,3,4,5,6};
        int start=0,size=arr.length;

        display(arr,size);

        reverse(arr,start,size);

        display(arr,size);

    }

}
