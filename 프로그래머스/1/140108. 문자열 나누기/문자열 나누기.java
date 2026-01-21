import java.util.*;

class Solution {
    public int solution(String s) {
        Deque<Character> sta = new ArrayDeque<>();
        char[] arr = s.toCharArray();
        int answer = 0;
        int countA = 0;
        int countB = 0;
        
        for (char ch : arr) {
            if (sta.isEmpty()) {
                sta.push(ch);
                countA++;
            } else {
                if (sta.peekFirst() == ch) {
                    countA++;
                } else {
                    countB++;
                }
            }
            
            if (countA == countB) {
                answer++;
                sta.clear();
                countA = 0;
                countB = 0;
            }
        }

        if (!sta.isEmpty()) {
                answer++;
        }

        return answer;
    }
}