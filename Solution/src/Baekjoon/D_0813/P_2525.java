package Baekjoon.D_0813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        int a = Integer.parseInt(s[0])*60;
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(br.readLine());

        int h = (a+b+c)/60;
        int m = (a+b+c)%60;

        if(h>=24)
            h=h-24;
        System.out.printf("%d %d",h,m);
    }
}