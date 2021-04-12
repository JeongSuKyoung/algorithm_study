package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class implement_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String l = br.readLine();
        String[] location = l.split("");
        int x = location[0].charAt(0) - 96;
        int y = Integer.parseInt(location[1]);

        int count = 0;
        int[] move_x = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] move_y = {-1, -2, -2, -1, 1, 2, 2, 1};

        for(int i = 0; i<move_x.length; i++){
            if(x + move_x[i] >= 1 && x + move_x[i] <= 8){
                if(y + move_y[i] >= 1 && move_y[i] <= 8)
                    count++;
            }
        }

        System.out.print(count);
    }
}
