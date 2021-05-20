package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class binarysearch_2 {
    public static int search(int[] arr, int m, int start, int end){
        int mid_value = (arr[start]+arr[end])/2;
        int mid_point = 0;
        int sum = 0;
        while(true) {
            sum = 0;
            mid_point = (start+end)/2;

            if(start > end)
                return mid_value;

            for (int i = mid_point; i < end+1; i++) {
                if (mid_value < arr[i])
                    sum += arr[i] - mid_value;
            }

            if (sum == m)
                break;
            else {
                mid_value++;
                start++;
            }
        }
        return mid_value;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String[] size = br.readLine().split(" ");
        int n = Integer.parseInt(size[0]);
        int m = Integer.parseInt(size[1]);

        int[] riceCake = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            riceCake[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(riceCake);

        System.out.print(search(riceCake,m,0,n-1));
    }
}
