package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_10872 {
    public static int fact(int n)
    {
        if(n <= 1)
            return 1;
        else
            return fact(n-1) * n;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.print(fact(n));

    }
}
