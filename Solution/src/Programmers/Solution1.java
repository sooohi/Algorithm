package Programmers;

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        int[] arr={1,1,3,3,0,1,1};
        //public int[] solution(int []arr){
        //public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        //int[] arr = {};
        int cnt=10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != cnt)
                list.add(arr[i]);
            cnt=arr[i];
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
            System.out.print(answer[i]);
        }

        //return answer;
    }
}
















