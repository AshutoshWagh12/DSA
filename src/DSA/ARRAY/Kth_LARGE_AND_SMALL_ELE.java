package DSA.ARRAY;

import java.util.Scanner;

public class Kth_LARGE_AND_SMALL_ELE {

    public static void display(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Kth_Largest_Element(int arr[],int size,int k){

        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==(k-1)){
                System.out.println(k+" th position largest value is :"+arr[i]);
                break;
            }
        }
    }

    public static void Kth_Smallest_Element(int arr[],int size,int k){

        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==(k-1)){
                System.out.println(k+" th position smallest value is :"+arr[i]);
            }
        }
    }

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);



        int arr[]={5,8,12,7,6,2,4,10,21,33};
        int size=arr.length;
        int k=2;

        display(arr,size);

        Kth_Largest_Element(arr,size,k);
//        Kth_Smallest_Element(arr,size,k);

        display(arr,size);

    }

}
