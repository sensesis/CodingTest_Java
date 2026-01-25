import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int h = 0;
        int w = 0;
        int total = brown + yellow;
        
        for (h = 3; h < total; h++) {
            if (total % h == 0) {
                w = total / h;
            }
            if (w < h) {
                continue;
            }
            if ((w - 2) * (h - 2) == yellow) {
                return new int[] {w, h};
            }
        }
        
        return answer;
    }
}