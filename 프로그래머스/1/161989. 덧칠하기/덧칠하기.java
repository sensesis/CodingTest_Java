import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] check = new boolean[n];
        Arrays.fill(check, true);

        for (int poll : section) {
            check[poll-1] = false;
        }

        for (int i = 0; i < n; i++) {
            if (check[i] == false) {
                answer++;
                i += (m-1);
            }
        }
        
        return answer;
    }
}