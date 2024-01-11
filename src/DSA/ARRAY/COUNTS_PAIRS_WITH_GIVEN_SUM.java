package DSA.ARRAY;

import java.util.Scanner;

public class COUNTS_PAIRS_WITH_GIVEN_SUM {
//        Input:
//        N = 4, K = 6
//        arr[] = {1, 5, 7, 1}
//        Output: 2
//        Explanation:
//        arr[0] + arr[1] = 1 + 5 = 6
//        and arr[1] + arr[3] = 5 + 1 = 6.

    public static int getPairsCount(int arr[],int n,int k){
        int count=0,j=0;
        while(j<n){
            for(int i=j+1;i<n;i++){
                if(arr[j]+arr[i]==k){
                    count++;
                }
            }
            j++;
        }
        return count;
    }

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int n = 4, k = 6;
        int arr[] = {1, 1, 1, 1};
//        int arr[] = {1, 2, 4, 5};

        int ans = getPairsCount(arr, n, k);
        System.out.println(ans);

    }

}
