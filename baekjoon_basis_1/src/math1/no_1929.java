package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i = m; i < n+1; i++)
        {
            boolean flag = true;

            if(i == 1)
                continue;
            for(int j = 2; j <= Math.sqrt(i); j++)
            {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag == true)
                System.out.println(i);
        }
    }
}
