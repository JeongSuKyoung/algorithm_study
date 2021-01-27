package dataStructure1;

import java.util.Scanner;
import java.util.Stack;

public class no_10828 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Stack<Integer> stack = new Stack<Integer>();
        String instruction;
        for(int i = 0; i < n; i++)
        {
            instruction = scanner.next();
            if(instruction.startsWith("push"))
                stack.push(scanner.nextInt());
            else if(instruction.equals("pop")) {
                if(stack.size() < 1){
                    System.out.println(-1);
                }
                else
                    System.out.println(stack.pop());
            }
            else if(instruction.equals("size"))
                System.out.println(stack.size());
            else if(instruction.equals("empty")) {
                if(stack.isEmpty())
                    System.out.println("1");
                else
                    System.out.println("0");
            }
            else if(instruction.equals("top")){
                if(stack.size() < 1)
                    System.out.println("-1");
                else
                    System.out.println(stack.peek());
            }

        }

    }
}
