package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class binarysearch_2_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String[] size = br.readLine().split(" ");
        int n = Integer.parseInt(size[0]);
        int m = Integer.parseInt(size[1]);

        int[] riceCake = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            riceCake[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(riceCake);

        int result = 0;
        int start = 0;
        int end = riceCake[n-1];
        while(start <= end){
            int sum = 0;
            int mid = (start+end)/2;

            for(int i=0; i<n; i++){
                if(riceCake[i] > mid)
                    sum += riceCake[i] - mid;
            }

            //떡의 양이 부족한 경우:  더 많이 자르기 - 왼쪽 탐색
            if (sum < m)
                end = mid -1;
            //떡의 양이 충분한 경우: 덜 자르기 - 오른쪽 탐색
            else{
                result = mid;
                start = mid + 1;
            }
        }
        System.out.print(result);
    }
}
