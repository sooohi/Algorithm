//A+B
package Softeer;

import java.util.*;
import java.io.*;

public class Solution1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[][] list = new int[T][2];

        for(int i=1; i<=T;i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Case #"+i+": "+(num1+num2));
        }
        sc.close();
    }
}
