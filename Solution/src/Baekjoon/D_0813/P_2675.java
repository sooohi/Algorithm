package Baekjoon.D_0813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            String[] s = br.readLine().split(" "); //문자열로 받고 split메소드 이용해서 공백 기준으로 자름

            int r = Integer.parseInt(s[0]);
            String[] str = s[1].split("");

            for(int j=0; j<s[1].length(); j++){
                for(int k=0; k<r; k++){
                    System.out.print(str[j]);
                }
            }
            System.out.println();
        }
    }
}

