//지도 자동 구축
package Softeer;

import java.util.*;
import java.io.*;

public class Solution5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=2;
        for(int i=0; i<n; i++){
            cnt=cnt+(cnt-1);
        }
        System.out.println((int)Math.pow(cnt,2));
        sc.close();
    }
}
