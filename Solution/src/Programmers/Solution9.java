package Programmers;
import java.util.*;
public class Solution9 {
    public static void main(String[] args) {
        boolean answer= false;
        String s= "(()(";
        int cnt=0;

        for(int i=0; i<s.length();i++){
            if(cnt<0)
                break;
            else if(cnt>=0&&s.charAt(i)=='(')
                cnt++;
            else if(s.charAt(i)==')')
                cnt--;
        }
        if(cnt==0)
            answer=true;

        System.out.print(answer);
    }
}
