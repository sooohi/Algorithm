import java.util.*;
public class Solution2 {
    //public int[] solution(int []arr){
    public static void main(String[] args) {
        int[] arr={1,3,2,4,2};
        List<Integer> list = new ArrayList<Integer>();
        int[] cnt = new int[3];
        int[] a ={1,2,3,4,5};
        int[] aa={2,1,2,3,2,4,2,5};
        int[] aaa={3,3,1,1,2,2,4,4,5,5};

        for (int i = 0; i < arr.length; i++) {
            if (a[i%5]==arr[i])
                cnt[0]++;
            if(aa[i%8]==arr[i])
                cnt[1]++;
            if(aaa[i%10]==arr[i])
                cnt[2]++;
        }

        int max=0;
        for (int i = 0; i < 3; i++) {
            if (cnt[i] >= max)
                max = cnt[i];
        }
        List<Integer> maxlist = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            if (cnt[i] == max)
                maxlist.add(i + 1);
        }
        for(int i=0; i<maxlist.size();i++)
            System.out.print(maxlist.get(i));
    }

    //return answer;
}




