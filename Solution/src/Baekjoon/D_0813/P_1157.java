package Baekjoon.D_0813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        char[] arr = new char[26];

        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                arr[s.charAt(i) - 'a']++;
            } else {
                arr[s.charAt(i) - 'A']++;
            }
        }
        int max = 0;
        char a = ' ';
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                a = (char) (i + 65);
            }
            else if (arr[i] == max) {
                a = '?';
            }
        }
        System.out.print(a);
    }
}
