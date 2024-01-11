package DSA_COURSE_PLAYLIST;


/*

--------------------------------- Insertion Sort ---------------------------------

        Sorted Array = S A

        Index ->    0   1   2   3   4
        Array ->  [ 7   12  3   4   1 ]

        1]     S A <--|--> Not S A
                  [ 7 | 12  3   4   1 ]    1 Possible Comparision
                                           1 Possible Swap

                Insert 12 in 7 But 7<12 No Swapping Required.

            =>    [ 7   12  3   4   1 ]

---------------------------------------------------------------------------------------

        2]         S A <--|--> Not S A
                  [ 7  12 | 3   4   1 ]    2 Possible Comparision
                        ^                  2 Possible Swap
                        3

                Insert 3 in 7 & 12
                But (12>3) Swapping Required.

            =>    [ 7  [] | 12   4   1 ]
                    ^
                    3  (7>3) Swapping Required.

        Ans =>    [ 3   7 | 12   4   1 ]

---------------------------------------------------------------------------------------

        3]             S A <--|--> Not S A
                  [ 3   7   12 | 4   1 ]    3 Possible Comparision
                            ^               3 Possible Swap
                            4

                Insert 4 in 3,7 & 12
                But (12>4) Swapping Required.

            =>    [ 3  7  [] | 12  1 ]
                       ^
                       4  (7>4) Swapping Required.

            =>    [ 3  []  7  | 12  1 ]
                    ^
                    4 (3<4) Not Swapping Required


        Ans =>    [ 3   4   7 | 12  1 ]

---------------------------------------------------------------------------------------

        4]                 S A <--|--> Not S A
                  [ 3   4   7  12 | 1 ]      4 Possible Comparision
                               ^             4 Possible Swap
                               1

                    Insert 1 in 3,4,7 & 12
                    But (12>1) Swapping Required.

            =>    [ 3   4   7  [] | 12 ]
                            ^
                            1 (7>1) Swapping Required.

            =>    [ 3   4   []  7 | 12 ]
                        ^
                        1 (4>1) Swapping Required.

            =>    [ 3   []   4  7 | 12 ]
                    ^
                    1 (3>1) Swapping Required.


        Ans =>    [ 1   3   4   7   12 ]

---------------------------------------------------------------------------------------


    Time Complexity :-

            Best Case = Total Comparision = 1+1+1+1 = 4
                                  = (n-1) = O(n)

            Worst Case = Total (n-1) passes.
                        Total Comparision/ Swaps = 1+2+3+...(n-1).
                                                 = (n(n-1))/2
---------------------------------------------------------------------------------------

*/

public class _30_INSERTION_SORT_ALGORITHM {

    static void display(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void Insertion_Sort(int arr[],int n){
        int key,j;
        for(int i=1;i<=n-1;i++){ //   i = 0   1   2   3   4
            //     [ 7   12  3   4   1 ]
            key=arr[i];          //       ^   ^
            j=i-1;               //       j   key (j<key) means j-1
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j]; //  j=7 push in Next index J+1=7
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {

		/*

		-1   0   1   2   3   4   5
		    12 | 54  65  7  23   9  -> i=1 , key=54 , j=0
		    12 | 54  65  7  23   9  -> 1st Pass Done

	   i -> 0    1   2   3   4   5
	        12  54 | 65  7  23   9  -> i=2 , key=65 , j=1
		    12  54 | 65  7  23   9  -> 2nd Pass Done

       i -> 0    1   2   3   4   5
		    12  54  65 | 7  23   9  -> i=3 , key=7 , j=2   (j--)
		    12  54  65 | 65 23   9  -> i=3 , key=7 , j=1
		    12  54  54 | 65 23   9  -> i=3 , key=7 , j=0
		    12  12  54 | 65 23   9  -> i=3 , key=7 , j=-1
            7   12  54 | 65 23   9  -> i=3 , key=7 , j=-1 -> 3rd pass Complete

	   i -> 0    1   2   3   4   5
            7   12  54  65 | 23  9  -> i=4 , key=23 ,j=3
            7   12  54  65 | 65  9  -> i=4 , key=23 ,j=2
            7   12  54  54 | 65  9  -> i=4 , key=23 ,j=1
            7   12  23  54 | 65  9  -> i=4 , key=23 ,j=1 -> 4th pass Complete

       i -> 0    1   2   3   4   5
            7   12  23  54  65 | 9  -> i=5 , key=9 , j=4
            7   12  23  54  65 | 65 -> i=5 , key=9 , j=3
            7   12  23  54  54 | 65 -> i=5 , key=9 , j=2
            7   12  23  23  54 | 65 -> i=5 , key=9 , j=1
            7   12  12  23  54 | 65 -> i=5 , key=9 , j=0
            7   9   12  23  54 | 65 -> i=5 , key=9 , j=0 -> 5th pass Complete

		*/

        int arr[]={12,54,65,7,23,9};
        int n=arr.length;

        display(arr,n);

        Insertion_Sort(arr,n);

        display(arr,n);

    }
}
