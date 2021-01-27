package dataStructure1_exer;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class no_17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int size = Integer.parseInt(br.readLine());
        int[] seq = new int[size];
        int[] freq = new int[1000001];
        int[] ans = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < size; i++)
            seq[i] = Integer.parseInt(st.nextToken());
        for(int i = 0; i < size; i++)
            freq[seq[i]] += 1;

        stack.push(0);
        for(int i = 1; i < size; i++)
        {
            while(!stack.isEmpty() && freq[seq[stack.peek()]] < freq[seq[i]])
                ans[stack.pop()] = seq[i];

            stack.push(i);
        }
        while(!stack.empty())
            ans[stack.pop()] = -1;

        for(int i = 0; i < size; i++)
            bw.write(ans[i] + " ");

        bw.flush();
        bw.close();

    }
}
