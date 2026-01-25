import java.util.*;

class Solution {
    public int solution(int n) {
        int sum = 1;
        int answer = 0;
        int l = 0;
        int r = 1;
        
        while (l < r) {
            if (n > sum) {
                r++;
                sum += r;
            }
            else {
                if (sum == n) {
                    answer++;
                }
                l++;
                sum -= l;
            }
        }
            
        return answer;
    }
}