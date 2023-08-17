package Baekjoon.D_0813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_2798 {
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        int max=0,sum=0;

        int[] arr = new int[n];
        st  = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1; k<n; k++){
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum<=m&&max<sum)
                        max=sum;
                }
            }
        }
        System.out.println(max);
    }
}
