package DSA_COURSE_PLAYLIST;


/*

        ----------------- Bubble Sort -----------------

     i ->    0   1   2   3   4   5     Array length(n) = 6
    Array -[ 7  11   9   2  17   4 ]

    Pass 1] :-
                                                     n = 6
        i -> 0   1   2   3   4   5   Comparisons -> (n-1) = 5
           [ 7  11   9   2  17   4 ]             [5 Possible Swap]
        =>
           [ 7  11   9   2  17   4 ] -> (0,1)
           [ 7 [9] [11]  2  17   4 ] -> (1,2) check in Updated Array
           [ 7  9  [2] [11] 17   4 ] -> (2,3) check in Updated Array
           [ 7  9   2   11  17   4 ] -> (3,4) check in Updated Array
           [ 7  9   2   11 [4] [17]] -> (4,5) check in Updated Array

-----------------------------------------------------------------------------

    Pass 2] :-
                                                     n = 6
        i -> 0   1   2   3   4   5   Comparisons -> (n-2) = 4
           [ 7  9   2   11 [4] [17]] -> New Updated Array
        =>
           [ 7   9   2   11  4  17 ] -> (0,1)  ->{New Updated Array}
           [ 7  [2] [9]  11  4  17 ] -> (1,2) check in Updated Array
           [ 7   2   9   11  4  17 ] -> (2,3) check in Updated Array
           [ 7   2   9  [4][11] 17 ] -> (3,4) check in Updated Array

-----------------------------------------------------------------------------

    Pass 3] :-
                                                     n = 6
        i -> 0   1   2   3   4   5   Comparisons -> (n-3) = 3
            [ 7   2   9  [4][11] 17 ] -> New Updated Array
        =>
           [[2] [7]  9   4  11  17 ] -> (0,1) check in Updated Array
           [ 2   7   9   4  11  17 ] -> (1,2) check in Updated Array
           [ 2   7  [4] [9] 11  17 ] -> (2,3) check in Updated Array

-----------------------------------------------------------------------------

    Pass 4] :-
                                                      n = 6
        i -> 0   1   2   3   4   5   Comparisons -> (n-4) = 2
           [ 2   7  [4] [9] 11  17 ] -> New Updated Array
        =>
           [ 2   7   4   9  11  17 ] -> (0,1) check in Updated Array
           [ 2  [4] [7]  9  11  17 ] -> (1,2) check in Updated Array

-----------------------------------------------------------------------------

    Pass 5] :-
                                                    n = 6
        i -> 0   1   2   3   4   5   Comparisons -> (n-5) = 1
           [ 2  [4] [7]  9  11  17 ] -> New Updated Array
        =>
           [ 2   4   7   9  11  17 ] -> (0,1)

-----------------------------------------------------------------------------

Bubble Sort :-

Time Complexity :-

    Worst Case:-
            1+2+3+4+.....(n-1) = (n(n-1))/2  = O(n^2)


[ 1 2 3 4 5] --> Adaptive (Already Sorted Array)
                Time Complexity = O(n).

-----------------------------------------------------------------------------
*/

public class _32_BUBBLE_SORT_ALGORITHM {

    // displaying Array Elements Function

    public static void display(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // Bubble Sort

    public static void BubbleSort(int arr[],int n){
        int temp;
        for(int i=0;i<n;i++){  // For Number of Passes
            for(int j=0;j<n-1-i;j++){  // For Comparisons in each pass
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void Adaptive_BubbleSort(int arr[],int n){
        int temp;
        boolean issorted=true;
        for(int i=0;i<n-1;i++){  // For Number of Passes
            System.out.println("Working on pass No "+(i+1));
            issorted=true;    // If Array is Sorted Only 1 Comparisons Create.
            // Array is Not Sorted To check How many
            // Comparisons Created.
            for(int j=0;j<n-1-i;j++){  // For Comparisons in each pass
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    issorted=false;
                }
            }
            if(issorted){
                return;
            }
        }
    }


    /*

    public static void BubbleSort1(int arr[],int n){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
      */

    public static void main(String [] args){

        // int arr[]={50,40,30,60,20,80};
        int arr[]={1,2,3,4,5,75,88,120,7,15,150};
        //int arr[]={1,2,3,4,5,6};
        int n=arr.length;

        display(arr,n);

        // BubbleSort(arr,n);

        Adaptive_BubbleSort(arr,n);

        System.out.println("Sorted Array :");
        display(arr,n);

    }
}
