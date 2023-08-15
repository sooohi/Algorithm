package Baekjoon.D_0813;

import java.util.Scanner;

public class P_1978 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            for (int j = 2; j <= num; j++) {
                if (j == num)
                    cnt++;
                if (num % j == 0)
                    break;
            }
        }
        System.out.print(cnt);
    }
}
