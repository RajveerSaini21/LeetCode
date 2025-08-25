import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int fresh_oranges = 0;

        // Count fresh oranges & add rotten ones to queue
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) {
                    queue.offer(new int[]{r, c});
                } else if (grid[r][c] == 1) {
                    fresh_oranges++;
                }
            }
        }

        if (fresh_oranges == 0) return 0;

        int minutes = -1;
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        // BFS
        while (!queue.isEmpty()) {
            int size = queue.size();
            minutes++;

            for (int i = 0; i < size; i++) {
                int[] point = queue.poll();
                int r = point[0];
                int c = point[1];

                for (int[] d : directions) {
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if (nr < 0 || nc < 0 || nr >= rows || nc >= cols || grid[nr][nc] != 1) {
                        continue;
                    }

                    grid[nr][nc] = 2;
                    queue.offer(new int[]{nr, nc});
                    fresh_oranges--;
                }
            }
        }

        return fresh_oranges == 0 ? minutes : -1;
    }
}
