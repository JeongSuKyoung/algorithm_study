package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class greedy_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String[] split_input = input.split(" ");
        int n = Integer.parseInt(split_input[0]);
        int m = Integer.parseInt(split_input[1]);
        int k = Integer.parseInt(split_input[2]);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(array);

        int count = (m / (k+1) * k) + (m % (k+1));
        int max = array[n-1] * count + array[n-2] * (m - count);

        System.out.print(max);
    }
}
