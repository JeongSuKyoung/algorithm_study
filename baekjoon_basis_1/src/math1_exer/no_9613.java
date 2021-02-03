package math1_exer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_9613 {
    public static int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        else
            return gcd(b, a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        for(int i = 0; i < input; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] array = new int[n];

            for(int j = 0; j < n; j++)
                array[j] = Integer.parseInt(st.nextToken());

            long sum = 0;
            for(int x = 0; x < n-1; x++){
                for(int y = x+1; y < n; y++){
                    if(array[x] > array[y])
                        sum += gcd(array[x], array[y]);
                    else
                        sum += gcd(array[y], array[x]);
                }
            }
            System.out.println(sum);
        }
    }
}
