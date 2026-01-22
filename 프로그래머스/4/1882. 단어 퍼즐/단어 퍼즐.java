import java.util.*;

class Solution {
    public int solution(String[] strs, String t) {
        Set<String> memo = new HashSet<>();
        for (String str : strs) {
            memo.add(str);
        }
        
        int[] dp = new int[t.length() + 1];
        Arrays.fill(dp, 20001);
        dp[0] = 0;
        
        for (int i = 1; i <= t.length(); i++) {
            for (int j = 1; j <= 5; j++) {
                if (i - j < 0) continue;
                
                String piece = t.substring(i - j, i);
                
                if (memo.contains(piece) && dp[i - j] != 20001) {
                    dp[i] = Math.min(dp[i], dp[i-j] + 1);
                }
            }
        }
        
        if (dp[t.length()] == 20001) return -1;
        return dp[t.length()];
    }
}