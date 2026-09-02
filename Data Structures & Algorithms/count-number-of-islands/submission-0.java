class Pair{
    int row;
    int col;
    Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}
class Solution {
    void bfs(char[][] grid, boolean[][] visited, int r, int c, int m, int n){
        visited[r][c] = true;
        Queue<Pair> qu = new ArrayDeque<>();
        qu.offer(new Pair(r,c));
        while(!qu.isEmpty()){
            Pair pr = qu.poll();
            int[] dr = {-1, 0, 0, 1};
            int[] dc = {0, -1, 1, 0};
            for(int i = 0; i < 4; i++){
                int nr = pr.row + dr[i];
                int nc = pr.col + dc[i];
                if(nr >= 0 && nr < m && nc >= 0 && nc < n){
                    if(grid[nr][nc] == '1' && !visited[nr][nc]){
                        visited[nr][nc] = true;
                        qu.offer(new Pair(nr, nc));
                    }
                }
            }
        }

    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int island = 0;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    island += 1;
                    bfs(grid, visited, i, j, m, n);
                }
            }
        }
        return island;
    }
}
