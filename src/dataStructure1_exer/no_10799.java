package dataStructure1_exer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int count = 0;
        int stick_count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '(')
                count++;
            else{
                count--;
                if(str.charAt(i - 1) == '(')
                    stick_count = stick_count + count;
                else
                    stick_count++;
            }
        }
        System.out.print(stick_count);
    }
}
