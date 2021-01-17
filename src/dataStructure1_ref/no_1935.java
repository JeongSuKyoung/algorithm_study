package dataStructure1_ref;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Double> stack = new Stack<Double>();

        int num = Integer.parseInt(br.readLine());
        char[] instruction = br.readLine().toCharArray();

        double[] op = new double[num];
        for(int i = 0; i < num; i++)
            op[i] = Integer.parseInt(br.readLine());

        for(int i = 0; i < instruction.length; i++)
        {
            if(Character.isAlphabetic(instruction[i])){
                int index = (int)instruction[i] - 65;
                stack.push(op[index]);
            }
            else{
                double a = stack.pop();
                double b = stack.pop();

                if(instruction[i] == '+')
                    stack.push(b + a);
                else if(instruction[i] == '-')
                    stack.push(b - a);
                else if(instruction[i] == '*')
                    stack.push(b * a);
                else if(instruction[i] == '/')
                    stack.push(b / a);
            }
        }
        System.out.format("%.2f", stack.pop());
    }
}
