package dataStructure1;

import java.io.*;
import java.util.Stack;

public class no_9093 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();

        String line;
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++)
        {
            line = br.readLine();
            line += "\n";

            StringBuilder result = new StringBuilder("");
            for(int j = 0; j < line.length(); j++)
            {
                if(line.charAt(j) == ' ' || line.charAt(j) == '\n'){
                    while(!stack.isEmpty()) {
                        result.append(stack.peek());
                        stack.pop();
                    }
                    if(line.charAt(j) == ' '){
                        result.append(line.charAt(j));
                    }
                }
                else {
                    stack.push(line.charAt(j));
                }

            }
            bw.write(result.toString() + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
