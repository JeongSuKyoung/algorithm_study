package dataStructure1_ref;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        char[] input = br.readLine().toCharArray();
        for(int i = 0; i < input.length; i++) {
            int index = (int) input[i] - 97;
            if(alphabet[index] == -1)
                alphabet[index] = i;
        }
        for(int i : alphabet)
            System.out.print(i + " ");
    }
}
