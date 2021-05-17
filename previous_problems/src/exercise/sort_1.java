package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sort_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Integer[] input = new Integer[n];
        for(int i=0; i<n; i++)
            input[i] = Integer.parseInt(br.readLine());
        Arrays.sort(input, Collections.reverseOrder());

        for(int i=0; i<n; i++)
            System.out.print(input[i]+" ");
    }
}
