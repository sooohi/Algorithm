package Programmers;
import java.util.*;
public class Solution8 {
    public static void main(String[] args) {
        String[] participant= {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion= {"josipa", "filipa", "marina", "nikola"};
        String answer="";

        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0; i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                answer=participant[i];
                break;
            }
            if(i==completion.length-1)
                answer=participant[i+1];
        }
        System.out.print(answer);
    }
}
