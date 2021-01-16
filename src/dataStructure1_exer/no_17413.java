package dataStructure1_exer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no_17413 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String str = br.readLine();

        int count = 0;
        while(count < str.length())
        {
            if(str.charAt(count) == '<'){
                while(str.charAt(count) != '>'){
                    System.out.print(str.charAt(count));
                    count++;
                }
                System.out.print(">");
                count++;
            }
            else if(str.charAt(count) == ' '){
                System.out.print(" ");
                count++;
            }
            else
            {
                while(count != str.length()){
                    if(str.charAt(count) == ' ' || str.charAt(count) == '<')
                        break;
                    stack.push(str.charAt(count));
                    count++;
                }
                while(!stack.isEmpty())
                    System.out.print(stack.pop());
            }
        }
    }
}
