package math1_exer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_1373 {
    public static int binToOct(String bin){
        int sum = 0;
        for(int i = 0; i < 3; i++)
        {
            sum += Character.getNumericValue(bin.charAt(i)) * Math.pow(2, 2-i);
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String binary = br.readLine();
        if(binary.length() % 3 == 1)
            binary = "00" + binary;
        else if(binary.length() % 3 == 2)
            binary = '0' + binary;

        for(int i = 0; i < (binary.length() / 3); i++){
            sb.append(binToOct(binary.substring(i*3, (i*3)+3)));
        }
        System.out.print(sb.toString());
    }
}
