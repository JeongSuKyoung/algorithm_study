package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class implement_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int hour = 0; hour < n+1; hour++){
            for(int min = 0; min < 60; min++){
                for(int sec = 0; sec < 60; sec++){
                    if(String.valueOf(hour).contains("3") || String.valueOf(min).contains("3") || String.valueOf(sec).contains("3"))
                        count++;
                }
            }
        }
        System.out.print(count);
    }
}
