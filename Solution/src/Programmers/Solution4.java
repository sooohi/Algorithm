package Programmers;
import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        List<Integer> answer = new ArrayList<Integer>();
        int n=0;
        for (int i = 0; i < commands.length; i++) {
            int[] list = new int[commands[i][1] - commands[i][0]];
            int cnt = 0;
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                list[cnt] = arr[j];
                cnt++;
            }
            Arrays.sort(list);
            answer[n]= list[commands[i][2]]);
            n++;
        }
        for (int k = 0; k < answer.size(); k++)
            System.out.print(answer.get(k));
    }
}
