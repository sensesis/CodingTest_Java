import java.util.*;

class Solution {
    public int solution(String s) {
        ArrayDeque<Character> sta = new ArrayDeque<>();
        
        for (char ch : s.toCharArray()) {
            if (sta.isEmpty()) {
                sta.push(ch);
                continue;
            }
            
            if (sta.peek().equals(ch)) {
                sta.pop();
            } else {
                sta.push(ch);
            }
        }
        
        return sta.isEmpty() ? 1 : 0;
    }
}