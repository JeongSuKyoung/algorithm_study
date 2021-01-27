package dataStructure1_exer;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class no_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int size = Integer.parseInt(br.readLine());
        int[] seq = new int[size];
        int[] ans = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < size; i++)
            seq[i] = Integer.parseInt(st.nextToken());

        stack.push(0);
        for(int i = 1; i < size; i++)
        {
            if(stack.isEmpty())
                stack.push(i);
            while(!stack.isEmpty() && seq[stack.peek()] < seq[i])
                ans[stack.pop()] = seq[i];

            stack.push(i);
        }
        for(int i = 0; i < size; i++)
        {
            if(ans[i] == 0)
                bw.write("-1 ");
            else
                bw.write(ans[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
