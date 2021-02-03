package math1_exer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_17087 {

    public static int gcd(int a, int b){
        if(b == 0)
            return a;
        else
            return gcd(b, a%b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] sis = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++)
            sis[i] = Integer.parseInt(st.nextToken());

        int min = Math.abs(sis[0] - s);
        for(int i = 1; i < n; i++)
            min = gcd(min, Math.abs(sis[i] - s));

        System.out.print(min);
    }
}
