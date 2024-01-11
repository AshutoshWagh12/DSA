package DSA_COURSE_PLAYLIST;


/*

----------------------------- Selection Sort -----------------------------


    :- Find Smallest Element in array & add at the Starting

        Index ->    0   1   2   3   4
        Array ->  [ 8   0   7   1   3 ]


                    0   1   2   3   4
                 [| 8   0   7   1   3 ]
           S A <--

         1st pass

        =>         0   1   2   3   4      4 Comparision
                 [ 0 | 8   7   1   3 ]
              S A <--

------------------------------------------------------------------------

        2nd pass

        =>         0   1   2   3   4      3 Comparision
                 [ 0   1 | 7   8   3 ]
                  S A <--

------------------------------------------------------------------------

        3rd pass

        =>         0   1   2   3   4      2 Comparision
                 [ 0   1   3 | 8   7 ]
                      S A <--

------------------------------------------------------------------------

        4th pass

        =>         0   1   2   3   4      1 Comparision
                 [ 0   1   3   7   8 ]
                             S A <--

------------------------------------------------------------------------

        Total Passes = (n-1)
        Max Swap = (n-1)

        Time Complexity = O(n^2)

------------------------------------------------------------------------
*/

public class _31_SELECTION_SORT_ALGORITHM {

    public static void display(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void Selection_Sort(int arr[],int n){
        int minIndex,temp;
        for(int i=0;i<n-1;i++){    // Number of Passes
            minIndex=i;            // 8 0 7 1 3
            for(int j=i+1;j<n;j++){// ^- i/ minIndex
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }

    public static void main(String[] args) {

        int arr[]={8,0,7,1,3};
        int n=arr.length;

        display(arr,n);

        Selection_Sort(arr,n);

        display(arr,n);

    }
}
