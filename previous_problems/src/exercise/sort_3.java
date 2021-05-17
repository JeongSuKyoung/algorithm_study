package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class sort_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size = br.readLine().split(" ");
        int n = Integer.parseInt(size[0]);
        int k = Integer.parseInt(size[1]);

        Integer[] array_a = new Integer[n];
        Integer[] array_b = new Integer[n];

        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            array_a[i] = Integer.parseInt(input1[i]);
            array_b[i] = Integer.parseInt(input2[i]);
        }
        Arrays.sort(array_a);
        Arrays.sort(array_b, Collections.reverseOrder());

        for(int i =0; i<n; i++)
        {
            if(array_a[i] < array_b[i]){
                array_a[i] = array_b[i];
                k--;
            }
            if(k==0)
                break;
        }

        int sum = 0;
        for(int i=0; i<n; i++)
            sum += array_a[i];

        System.out.println(sum);
    }
}
