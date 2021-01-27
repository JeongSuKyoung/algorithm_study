package dataStructure1_ref;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        String[] four_num = input.split(" ");
        long ac = Long.parseLong(four_num[0] + four_num[1]);
        long bd = Long.parseLong(four_num[2] + four_num[3]);

        sb.append(ac + bd);
        System.out.print(sb);
    }
}
