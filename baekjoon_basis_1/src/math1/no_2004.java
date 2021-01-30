package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_2004 {
    public static long getFiveCount(long num)
    {
        int count = 0;
        while(num >= 5)
        {
            count += num/5;
            num /= 5;
        }
        return count;
    }
    public static long getTwoCount(long num)
    {
        int count = 0;
        while(num >= 2)
        {
            count += num/2;
            num /= 2;
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long fiveCount = getFiveCount(n) - getFiveCount(n-m) - getFiveCount(m);
        long twoCount = getTwoCount(n) - getTwoCount(n-m) - getTwoCount(m);

        System.out.print(Math.min(fiveCount,twoCount));

    }
}
