//주행거리 비교
package Softeer;

import java.util.*;
import java.io.*;

public class Solution3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1>num2)
            System.out.println("A");
        else if(num1<num2)
            System.out.println("B");
        else
            System.out.println("same");
        sc.close();
    }
}
