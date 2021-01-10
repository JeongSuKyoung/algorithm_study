package dataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class no_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 1; i < k+1; i++)
            queue.add(i);

        System.out.print("<");
        for(int i = 0; i < k; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(j != n-1){
                    queue.add(queue.peek());
                    queue.poll();
                }
                else{
                    if(i == k -1)
                        System.out.print(queue.poll());
                    else
                        System.out.print(queue.poll() + ", ");
                }

            }

        }
        System.out.print(">");
    }
}
