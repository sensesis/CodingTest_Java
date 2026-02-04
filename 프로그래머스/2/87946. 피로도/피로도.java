import java.util.*;

class Solution {
    int maxCount = 0;

    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        
        dfs(k, dungeons, visited, 0);
        
        return maxCount;
    }
    
    private void dfs(int curK, int[][]dungeons, boolean[] visited, int count) {
        maxCount = Math.max(maxCount, count);
        
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && curK >= dungeons[i][0]) {
                visited[i] = true;
                dfs(curK - dungeons[i][1], dungeons, visited, count + 1);
                visited[i] = false;
            }
        }
    }
}