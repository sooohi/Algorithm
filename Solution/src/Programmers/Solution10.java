package Programmers;
import java.util.*;
public class Solution10 {
    public static void main(String[] args) {
        String s= "(()(";
        boolean answer = true;
        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(')
                stack.push('(');
            else {
                if (stack.isEmpty())
                    answer = false;
                else
                    stack.pop();
            }
        }
        if(stack.size()>0)
            answer = false;

        System.out.print(answer);
    }
}