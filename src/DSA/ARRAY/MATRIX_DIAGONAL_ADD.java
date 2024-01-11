package DSA.ARRAY;

import java.util.Scanner;

public class MATRIX_DIAGONAL_ADD {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the matrix size X*X : ");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        System.out.println("Enter the Matrix Element : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // addition of left diagonal

        int sum_left=0;
        int i=0,j=0;
        while(i<n && j<n){
            sum_left += arr[i][j];
            i++;
            j++;
        }
        System.out.println("The addition of left diagonal : "+sum_left);

        // addition of right diagonal

        int sum_Right=0;
        int k=0,m=2;
        while(k<n && m>=0){
            sum_Right += arr[k][m];
            k++;
            m--;
        }
        System.out.println("The addition of right diagonal : "+sum_Right);

        int sum = sum_left - sum_Right;

        System.out.println("Addition of diagonal is :"+sum);
        System.out.println("Addition of diagonal is :"+Math.abs(sum));

    }

}
