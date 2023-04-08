package Programmers;
import java.util.*;
public class Solution7 {
    public static void main(String[] args) {
       int[] cnt= new int[200001];
       int[] nums={3,1,2,3};
        int answer = 0;
        for(int i = 0; i < nums.length; i++) {
            if(cnt[nums[i]] == 0) {
                answer++;
            }
            cnt[nums[i]]++;
            if(answer > nums.length / 2) {
                answer = nums.length / 2;
                break;
            }
        }
        System.out.print(answer);
    }
}
