package dataStructure1;

import java.io.*;

public class no_9012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++)
        {
            int left = 0;
            int right = 0;

            String str = br.readLine();
            for(int j = 0; j < str.length(); j++)
            {
                if(str.charAt(j) == '(')
                    left++;
                else if(str.charAt(j) == ')')
                    right++;
                if(right > left){
                    System.out.println("NO");
                    break;
                }

                if(j == str.length() - 1)
                    if(right == 0)
                        System.out.println("NO");
                    else if(left == right)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
            }
        }
    }
}
