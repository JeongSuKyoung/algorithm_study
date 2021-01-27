package dataStructure1_ref;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] suffix = new String[input.length()];
        for(int i = 0; i < input.length(); i++)
            suffix[i] = input.substring(i);
        Arrays.sort(suffix);

        for(String i : suffix)
            System.out.println(i);
    }
}
