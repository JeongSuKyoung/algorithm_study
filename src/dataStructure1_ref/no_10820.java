package dataStructure1_ref;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while((input = br.readLine()) != null)
        {
            int[] char_count = new int[4];
            for(int i = 0; i < input.length(); i++)
            {
                if(input.charAt(i) == ' ')
                    char_count[3]++;
                else if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
                    char_count[0]++;
                else if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
                    char_count[1]++;
                else if((int)input.charAt(i) >= 48 && (int)input.charAt(i) <= 57)
                    char_count[2]++;

            }
            for(int i: char_count)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
