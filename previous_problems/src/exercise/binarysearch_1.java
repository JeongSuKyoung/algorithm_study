package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class binarysearch_1 {
    public static int search(int[] arr, int productNum, int start, int end){
        if(start > end)
            return 0;

        int mid = (start+end)/2;

        if(arr[mid] == productNum)
            return 1;
        else if(arr[mid] > productNum)
            return search(arr, productNum, start, mid-1);
        else
            return search(arr, productNum, mid+1, end);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] store = br.readLine().split(" ");

        int[] storeHave = new int[n];
        for(int i=0; i<n; i++)
            storeHave[i] = Integer.parseInt(store[i]);
        Arrays.sort(storeHave);

        int m = Integer.parseInt(br.readLine());
        String[] customer = br.readLine().split(" ");

        int result = 0;
        for(int i=0; i<m; i++){
            result = search(storeHave, Integer.parseInt(customer[i]), 0, n-1);
            if(result != 0)
                System.out.print("yes ");
            else
                System.out.print("no ");
        }
    }
}
