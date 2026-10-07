import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RatInMaze {
    static void solve(int i,int j,int [][]maze,int n,String move,ArrayList<String>res,int [][]vis) {
        //base case
        if (i == n - 1 && j == n - 1) {
            res.add(move);
            return;
        }
        //mark current cell
        vis[i][j] = 1;

        //down
        if (i + 1 < n && vis[i + 1][j] == 0 && maze[i + 1][j] == 1) {
            solve(i + 1, j, maze, n, move + "D", res, vis);
        }
        //left
        if (j - 1 >= 0 && vis[i][j - 1] == 0 && maze[i][j - 1] == 1) {
            solve(i, j - 1, maze, n, move + "L", res, vis);
        }
        //right
        if (j + 1 < n && vis[i][j + 1] == 0 && maze[i][j + 1] == 1) {
            solve(i, j + 1, maze, n, move + "R", res, vis);
        }
        //up
        if (i - 1 >= 1 && vis[i - 1][j] == 0 && maze[i - 1][j] == 1) {
            solve(i - 1, j, maze, n, move + "U", res, vis);
        }
        vis[i][j] = 0;
    }
    static List<String>ratInMaze(int[][]maze){
            ArrayList<String> res = new ArrayList<>();

            int n = maze.length;
            if (maze[0][0] == 0 && maze[n - 1][n - 1] == 0) return res;

            int [][]vis=new int [n][n];

            solve(0,0,maze,n,"",res,vis);
            Collections.sort(res);
            return res;

        }

    public static void main(String[] args) {
        int[][]maze={
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        List<String>ans=ratInMaze(maze);
        System.out.println(ans);
    }

}
