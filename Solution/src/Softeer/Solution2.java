//근무 시간
package Softeer;

import java.util.*;
import java.io.*;

public class Solution2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        for(int i=1; i<=5;i++){
            String start = sc.next();
            String end = sc.next();
            int starthour = Integer.parseInt(start.substring(0,2));
            int startminutes = Integer.parseInt(start.substring(3,5));
            int endhour = Integer.parseInt(end.substring(0,2));
            int endminutes = Integer.parseInt(end.substring(3,5));
            cnt+= ((endhour*60)+endminutes)-((starthour*60)+startminutes);
        }
        System.out.println(cnt);
        sc.close();
    }
}
