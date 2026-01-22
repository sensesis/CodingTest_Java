import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[targets.length];

        for (String key : keymap) {
            int count = 0;

            for (int i = 0; i < key.length(); i++) {
                char ch = key.charAt(i);
                count++; 

                if (map.containsKey(ch)) {
                    map.put(ch, Math.min(map.get(ch), count));
                } else {
                    map.put(ch, count);
                }
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            boolean isPossible = true;

            for (char ch : targets[i].toCharArray()) {
                if (!map.containsKey(ch)) {
                    isPossible = false;
                    break;
                }
                else {
                    sum += map.get(ch);    
                }
            }
            
            answer[i] = isPossible ? sum : -1;
        }
        
        return answer;
    }
}