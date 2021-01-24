package dataStructure1_ref;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < input.length(); i++)
        {
            char cursor = input.charAt(i);
            if(Character.isLowerCase(cursor)){
                if((int)cursor + 13 <= 122)
                    sb.append((char)((int)cursor + 13));
                else
                    sb.append((char) ((int) cursor - 13));
            }
            else if(Character.isUpperCase(cursor)){
                if((int)cursor + 13 <= 90)
                    sb.append((char)((int)cursor + 13));
                else
                    sb.append((char) ((int) cursor - 13));
            }
            else if((int)cursor >= 48 && (int)cursor <= 57){
                sb.append(cursor);
            }
            else if(cursor == ' ')
                sb.append(' ');
        }
        System.out.print(sb.toString());
    }
}
