import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (isTrue(s)) answer++;
            
            s = s.substring(1) + s.charAt(0);
        }
        
        return answer;
    }
    
    private boolean isTrue(String s) {
        Deque<Character> sta = new ArrayDeque<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                sta.push(ch);
            } 
            else {
                if (sta.isEmpty()) return false;
                
                char top = sta.peek();
                
                if ((top == '(' && ch == ')') ||
                    (top == '{' && ch == '}') ||
                    (top == '[' && ch == ']')) {
                    sta.pop();
                } 
                else {
                    return false; 
                }
            }
        }
        
        return sta.isEmpty();
    }
}