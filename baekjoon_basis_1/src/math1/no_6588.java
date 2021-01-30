package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class no_6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean isPrime[] = new boolean[1000001];
        Arrays.fill(isPrime,true);
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i <= Math.sqrt(1000000); i++)
        {
            if(!isPrime[i])
                continue;
            for(int j = i*i; j <= 1000000; j = j+i)
                isPrime[j] = false;
        }

        String input;
        while((input = br.readLine()) != null){
            boolean flag = false;
            int number = Integer.parseInt(input);

            if(number == 0) {
                System.out.print(sb);
                return;
            }
            for(int i = 3; i <= number; i++)
            {
                if(isPrime[i] && isPrime[number-i]) {
                    sb.append(number + " = " + i + " + " + (number - i)).append("\n");
                    flag = true;

                    break;
                }
            }
            if(!flag)
                sb.append("Goldbach's conjecture is wrong.").append("\n");
        }
    }
}
