package dataStructure1;

import java.io.*;
import java.util.LinkedList;

public class no_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++)
        {
            String instruction = br.readLine();
            if(instruction.startsWith("push")){
                String[] result = instruction.split(" ");
                queue.offer(Integer.parseInt(result[1]));
            }
            else if(instruction.equals("pop")){
                if(queue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(queue.poll());
            }
            else if(instruction.equals("size")){
                System.out.println(queue.size());
            }
            else if(instruction.equals("empty")){
                if(queue.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            }
            else if(instruction.equals("front")){
                if(queue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(queue.peek());
            }
            else if(instruction.equals("back")){
                if(queue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(queue.getLast());
            }
        }
    }
}
