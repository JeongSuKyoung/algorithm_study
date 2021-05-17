package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sort_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<String,Integer> student_list = new HashMap<>();
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            student_list.put(input[0],Integer.parseInt(input[1]));
        }
        List<Map.Entry<String, Integer>> result = new ArrayList<>(student_list.entrySet());
        result.sort(Map.Entry.comparingByValue());

        for(int i=0; i<n; i++)
            System.out.print(result.get(i).getKey()+" ");
    }
}
