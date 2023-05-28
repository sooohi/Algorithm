package Baekjoon;

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int k = sc.nextInt();
        for(int i = 0; i < k; i++) {
            int number = sc.nextInt();
            if(number == 0) {
                stack.pop();
            }
            else {
                stack.push(number);
            }
        }
        int cnt = 0;
        for(int i : stack) {
            cnt += i;
        }
        System.out.println(cnt);
        sc.close();
    }
}














