//8단 변속기
package Softeer;

import java.util.*;
import java.io.*;

public class Solution4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        int cnt1=0;
        int[] ascending = {1,2,3,4,5,6,7,8};
        int[] descending={8,7,6,5,4,3,2,1};
        for(int i=0; i<8; i++){
            int num = sc.nextInt();
            if(num==ascending[i])
                cnt++;
            else if(num==descending[i])
                cnt1++;
        }
        if(cnt==8)
            System.out.print("ascending");
        else if(cnt1==8)
            System.out.print("descending");
        else
            System.out.print("mixed");
        sc.close();
    }
}
