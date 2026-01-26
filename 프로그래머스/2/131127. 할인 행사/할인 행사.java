import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> curMap = new HashMap<>();
        
        for (int i = 0; i < want.length; i++) {
            curMap.put(want[i], number[i]);
        }
        
        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> tempMap = new HashMap<>();
            
            for (int j = i; j < (10 + i); j++) {
                tempMap.put(discount[j], tempMap.getOrDefault(discount[j], 0) + 1);
            }
            
            if (curMap.equals(tempMap)) {
                answer++;
            }
        }
        
        return answer;
    }
}