import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> memo = new HashSet<>();
        memo.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String perv = words[i-1];
            String curr = words[i];
            
            if (perv.charAt(perv.length() - 1) != curr.charAt(0) || memo.contains(curr)) {
                int human = (i % n) + 1;
                int round = (i / n) + 1;
                
                return new int[] {human, round};
            }
            
            memo.add(curr);
        }
        return new int[] {0, 0};
    }
}