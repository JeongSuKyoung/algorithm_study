package math1_exer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] octToBin = {"000", "001", "010", "011", "100", "101", "110", "111"};

        char[] input_oct = br.readLine().toCharArray();
        int[] oct = new int[input_oct.length];
        for(int i = 0; i < input_oct.length; i++){
            oct[i] = Integer.parseInt(String.valueOf(input_oct[i]));
        }

        if(oct.length == 1 && oct[0] == 0)
        {
            System.out.print(0);
        }
        else {
            for(int i = 0; i < oct.length; i++)
            {
                if(i == 0 && oct[i] < 4){
                    if(oct[i] == 1)
                        sb.append("1");
                    else if(oct[i] == 2)
                        sb.append("10");
                    else if(oct[i] == 3)
                        sb.append("11");
                }
                else
                    sb.append(octToBin[Integer.parseInt(String.valueOf(oct[i]))]);
            }
        }
        System.out.print(sb);
    }
}
