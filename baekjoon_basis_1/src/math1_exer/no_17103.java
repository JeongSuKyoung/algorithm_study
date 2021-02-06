package math1_exer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no_17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        boolean[] isPrime = new boolean[1000001];
        Arrays.fill(isPrime,true);
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i <= Math.sqrt(1000000); i++)
        {
            if(!isPrime[i])
                continue;
            for(int j = i*i; j <= 1000000; j = j+i)
                isPrime[j] = false;
        }

        for(int i = 0; i < T; i++)
        {
            int count = 0;

            int n = Integer.parseInt(br.readLine());
            for(int j = 2; j < (n/2) + 1; j++)
            {
                if(isPrime[j] && isPrime[n-j])
                    count++;
            }
            System.out.println(count);
        }
    }
}
