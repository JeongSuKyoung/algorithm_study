package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dfs_1 {
    private static int n;
    private static int m;
    private static int[][] ice;

    public static int dfs(int node_x, int node_y){
        if(node_x <= -1 || node_x >= n || node_y <=-1 || node_y >= m)
            return 0;

        if(ice[node_x][node_y] == 0)
        {
            ice[node_x][node_y] = 1;

            dfs(node_x-1, node_y);
            dfs(node_x, node_y-1);
            dfs(node_x+1, node_y);
            dfs(node_x, node_y+1);

            return 1;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        ice = new int[n][m];
        for(int i=0; i<n; i++) {
            String[] input2 = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                ice[i][j] = Integer.parseInt(input2[j]);
            }
        }

        int count = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if (dfs(i,j) == 1){
                    count++;
                    System.out.print(i +" "+ j+", ");
                }
            }
        }
        System.out.print(count);

    }
}
