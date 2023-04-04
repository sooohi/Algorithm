package Programmers;
import java.util.*;
public class Solution6 {
    public static void main(String[] args) {
        int[] progresses = {95,90,99,99,80,99};
        int[] speeds = {1,1,1,1,1,1};
        int[] day = new int[progresses.length];
        List<Integer> answer = new ArrayList<Integer>();

        //각 작업별 베포 일 구하기
        for (int i = 0; i < progresses.length; i++) {
            day[i] = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0)
                day[i] += 1;
        }
        //해당 인덱스보다 작은 인덱스 까지 개수 구하기
        int temp = day[0];
        int cnt = 1;
        for (int i = 1; i < day.length; i++) {
            if (temp < day[i]) {
                answer.add(cnt);
                cnt = 1;
                temp = day[i];
            } else
                cnt++;
        }
        answer.add(cnt);

        for (int i = 0; i < answer.size(); i++)
            System.out.print(answer.get(i));
    }
}

