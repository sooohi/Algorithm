//근무 시간
package Softeer;

import java.util.*;
import java.io.*;

public class Solution2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=5;i++){
        String start = sc.next();
        String end = sc.next();
        int startH = Integer.parseInt(start.substring(0,2));
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Case #"+i+": "+(num1+num2));
        }
        sc.close();
    }
}
