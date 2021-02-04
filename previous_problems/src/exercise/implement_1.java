package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class implement_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int x = 1; int y = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            String direction = st.nextToken();
            if(direction.equals("R")) {
                if(y+1 < n)
                    y++;
            }
            else if(direction.equals("L")){
                if(y-1 > 0)
                    y--;
            }
            else if(direction.equals("U")){
                if(x-1 > 0)
                    x--;
            }
            else if(direction.equals("D")){
                if(x+1 < n)
                    x++;
            }
        }
        System.out.print(x + " " +y);
    }
}
