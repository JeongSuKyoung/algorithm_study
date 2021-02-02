package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class greedy_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int max = 0;
        for(int i = 0; i < n; i++)
        {
            st = new StringTokenizer(br.readLine());
            int min = Integer.parseInt(st.nextToken());
            while(st.hasMoreTokens()){
                int temp = Integer.parseInt(st.nextToken());
                min = Math.min(min, temp);

            }
            max = Math.max(max, min);
        }

        System.out.print(max);
    }
}
