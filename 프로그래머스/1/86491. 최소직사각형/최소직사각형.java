import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        int maxW = 0;
        int maxH = 0;
        
        for (int[] cur : sizes) {
            w = Math.max(cur[0], cur[1]);
            h = Math.min(cur[0], cur[1]);

            maxW = Math.max(maxW, w);
            maxH = Math.max(maxH, h);
        }
        
        return  maxW * maxH;
    }
}