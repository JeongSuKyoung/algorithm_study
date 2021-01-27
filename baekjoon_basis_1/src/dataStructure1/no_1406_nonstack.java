package dataStructure1;

import java.io.*;

public class no_1406_nonstack {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuffer str = new StringBuffer(br.readLine());

        int cursor = str.length();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++)
        {
            String instruction = br.readLine();

            if(instruction.equals("L")){
                if(cursor == 0)
                    cursor = 0;
                else
                    cursor--;
            }
            else if(instruction.equals("D")){
                if(cursor == str.length())
                    cursor = str.length();
                else
                    cursor++;
            }
            else if(instruction.equals("B")){
                if(cursor == 0)
                    cursor = 0;
                else{
                    str.deleteCharAt(cursor - 1);
                    cursor--;
                }
            }
            else if(instruction.startsWith("P")){
                String[] result = instruction.split(" ");
                str.insert(cursor,result[1]);
                cursor ++;
            }
        }
        bw.write(String.valueOf(str));
        bw.flush();
        bw.close();
    }
}
