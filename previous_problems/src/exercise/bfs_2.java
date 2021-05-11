package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class bfs_2 {
    private static int n;
    private static int m;
    private static int[][] maze;

    public static int bfs(int x, int y)
    {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while(!queue.isEmpty()){

            int[] result = queue.peek();
            queue.remove();

            for(int i=0; i<4; i++)
            {
                int nx = result[0] + dx[i];
                int ny = result[1] + dy[i];

                if(nx < 0 || nx >= n || ny < 0 || ny >= m)
                    continue;
                if(maze[nx][ny] == 0)
                    continue;
                if(maze[nx][ny] == 1){
                    maze[nx][ny] = maze[result[0]][result[1]] + 1;
                    queue.add(new int[]{nx,ny});
                }
            }
        }
        return maze[n-1][m-1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        maze = new int[n][m];
        for(int i=0; i<n; i++) {
            String[] input2 = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                maze[i][j] = Integer.parseInt(input2[j]);
            }
        }
        System.out.println(bfs(0,0));
    }
}
