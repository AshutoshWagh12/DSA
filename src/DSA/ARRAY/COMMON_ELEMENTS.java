package DSA.ARRAY;

import java.util.HashSet;
import java.util.Scanner;

public class COMMON_ELEMENTS {

    public static void Common(int arr1[],int arr2[],int size1,int size2){

        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<size1;i++){

            for(int j=0;j<size2;j++){

                if(arr1[i]==arr2[j]){

//                  System.out.print(arr1[i]+" "); // this is efficient when all ele. are Unique.

                    // If there are duplicate elements in array then add elements in hashset
                    // [10,20,30,40,50,10] becz this gives 10 double in output.

                    hs.add(arr1[i]);
                    break;
                }
            }
        }
        for (int e:hs){
            System.out.print(e+" ");
        }
    }

    public static void com(int arr1[],int arr2[],int size1,int size2){

        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();

        for(int i=0;i<size1;i++){
            h1.add(arr1[i]);
        }

        for(int i=0;i<size2;i++){
            h2.add(arr2[i]);
        }

        for(int e:h1){

        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr1[]={10,20,80,50,30,10,8};
        int arr2[]={1,8,50,90,4,100,22,10,50};

        int size1=arr1.length;
        int size2=arr2.length;

        Common(arr1,arr2,size1,size2);

    }
}
