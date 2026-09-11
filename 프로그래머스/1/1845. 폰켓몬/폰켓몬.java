import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = nums.length / 2;
        
        for (int pkm : nums) {
            set.add(pkm);
        }
        
        return Math.min(max, set.size());
    }
}