package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class greedy_1 {
    public static void main(String[] args) throws IOException {
        long start_time = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int money = Integer.parseInt(br.readLine());

        int[] coins = {500,100,50,10};
        int count = 0;
        for(int coin: coins){
            count += money / coin;
            money = money % coin;
        }
        System.out.println(count);

        long end_time = System.currentTimeMillis();
        System.out.print(end_time-start_time);
    }
}
