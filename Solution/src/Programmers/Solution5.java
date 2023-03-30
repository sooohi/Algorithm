package Programmers;
import java.util.*;
public class Solution5 {
    public static void main(String[] args) {
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        int n = 5;
        int answer = n - lost.length; //전체 학생 n -잃어버린 학생 lost
        Arrays.sort(lost);
        Arrays.sort(reserve);

        /*Scanner n = new Scanner(System.in);
        int count = n.nextInt();
        int answer = count-lost.length;
        */

        // 여벌 옷 있는 학생이 도난당했을 때
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;//여벌 있으니까 들을 수 있음
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        //벌
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if ((lost[i] - 1 == reserve[j]) || (lost[i] + 1 == reserve[j])) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        System.out.print(answer);
    }
}
