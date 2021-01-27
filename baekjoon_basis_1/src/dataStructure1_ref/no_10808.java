package dataStructure1_ref;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabet = new int[26];
        char[] words = br.readLine().toCharArray();
        for(int i = 0; i < words.length; i++)
            alphabet[(int)words[i] - 97] += 1;
        for(int i : alphabet)
            System.out.print(i + " ");
    }
}
