package DSA.ARRAY;

import java.util.Scanner;

public class CONTAINS_WATER {

    public static int maxArea(int[] height) {

        // Time Complexity :- BigO(N)

        int size = height.length;

        int l=0;
        int r=height.length-1;

        int Max_Area=0;

        while(l<r){
            int lowHeight = Math.min(height[l],height[r]);
            int len = r-l;
            int Current_Area = lowHeight * len;
            Max_Area = Math.max(Max_Area,Current_Area);
            if (height[r]<height[l]){
                r--;
            }
            else if(height[r]>height[l]) {
                l++;
            }
            else {
                l++;
                r--;
            }
        }
        return Max_Area;
    }

//    public static int maxArea(int[] height) {
//
//        int size = height.length;
//
//        int Max_Area=0;
//
//        for(int i=0;i<size;i++){
//            int len =1;
//            for(int j=i+1;j<size;j++){
//                int lowHeight = Math.min(height[i],height[j]);
//                int Current_Area = lowHeight * len;
//                if(Current_Area>Max_Area){
//                    Max_Area=Current_Area;
//                }
//                len++;
//            }
//            len=0;
//        }
//        return Max_Area;
//    }

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        int height[] = {1,8,6,2,5,4,8,3,7};

        int result = maxArea(height);
        System.out.println(result);



        /*

        Container With Most Water



        9 |       8                   8
        8 |       |                   |       7
        7 |       |   6               |       |
        6 |       |   |       5       |       |
        5 |       |   |       |   4   |       |
        4 |       |   |       |   |   |   3   |
        3 |       |   |   2   |   |   |   |   |
        2 |   1   |   |   |   |   |   |   |   |
        1 |   |   |   |   |   |   |   |   |   |
        0 |___|___|___|___|___|___|___|___|___|___
          0   1   2   3   4   5   6   7   8   9
                  <------------------------->
                           7(length)

                          Max Water fill
                   <------------------------->

        Area = height * length
             =   7  * 7  = 49

         */

    }

}
