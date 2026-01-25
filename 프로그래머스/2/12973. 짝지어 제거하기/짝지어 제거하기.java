import java.util.*;

class Solution {
    public int solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int answer = 0;

        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
                continue;
            }
            
            if (stack.peek().equals(ch)) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        
        
        
        return stack.isEmpty() ? 1 : 0;
    }
}