package dataStructure1;

import java.io.*;
import java.util.Stack;

public class no_1406_stack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        Stack<String> leftSt = new Stack<String>();
        Stack<String> rightSt = new Stack<String>();

        String[] arr = str.split("");
        for(String s: arr) {
            leftSt.push(s);
        }

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++)
        {
            String instruction = br.readLine();

            if(instruction.equals("L")){
                if(!leftSt.isEmpty())
                    rightSt.push(leftSt.pop());
            }
            else if(instruction.equals("D")){
                if(!rightSt.isEmpty())
                    leftSt.push(rightSt.pop());
            }
            else if(instruction.equals("B")){
                if(!leftSt.isEmpty())
                    leftSt.pop();
            }
            else if(instruction.startsWith("P")){
                char t = instruction.charAt(2);
                leftSt.push(String.valueOf(t));
            }
        }

        while(!leftSt.isEmpty())
            rightSt.push(leftSt.pop());
        while(!rightSt.isEmpty())
            bw.write(rightSt.pop());

        bw.flush();
        bw.close();
    }
}
