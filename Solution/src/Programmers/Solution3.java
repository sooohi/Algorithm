package Programmers;

import java.util.*;
public class Solution3 {
    public static void main(String[] args) {
        int max=0, max2=0;
        int[][] arr={{10, 7}, {12, 3}, {8, 15}, {14, 7},{5,15}};

        for(int i=0;i<arr.length;i++) {
            int a = Math.max(arr[i][0], arr[i][1]);
            int aa = Math.min(arr[i][0], arr[i][1]);

            if(a>max)
                max=a;
            if(aa>max2)
                max2=aa;
        }
        System.out.print(max*max2);
    }
}
