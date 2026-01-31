import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> memo = new HashMap<>();
        int answer = 1;
        
        for (String[] str : clothes) {
            memo.put(str[1], memo.getOrDefault(str[1], 0) + 1);
        }
        
        for (int count : memo.values()) {
            answer *= count + 1;
        }
        
        return --answer;
    }
}