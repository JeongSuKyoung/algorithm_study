package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] number_split = input.split(" ");
        int[] number = new int[3];
        for(int i = 0; i < 3; i++)
            number[i] = Integer.parseInt(number_split[i]);

        System.out.println((number[0] + number[1]) % number[2]);
        System.out.println(((number[0] % number[2]) + (number[1] % number[2])) % number[2]);
        System.out.println((number[0] * number[1]) % number[2]);
        System.out.println(((number[0] % number[2]) * (number[1] % number[2])) % number[2]);
    }
}
