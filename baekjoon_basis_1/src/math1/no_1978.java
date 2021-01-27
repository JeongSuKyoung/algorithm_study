package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            boolean flag = true;
            int number = Integer.parseInt(st.nextToken());

            if(number == 1)
                continue;
            for(int j = 2; j <= Math.sqrt(number); j++)
            {
                if(number % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag == true)
                count++;
        }
        System.out.println(count);
    }
}
