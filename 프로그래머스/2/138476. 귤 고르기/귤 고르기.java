import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> memo = new HashMap<>();
        
        for (int idx : tangerine) {
            memo.put(idx, memo.getOrDefault(idx, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(memo.values());
        Collections.sort(list, Collections.reverseOrder());
        
        int answer = 0;
        
        for (int num : list) {
            if (k <= 0) {
                break;
            } else {
                k = k - num;
                answer++;
            }
        }
        
        return answer;
    }
}