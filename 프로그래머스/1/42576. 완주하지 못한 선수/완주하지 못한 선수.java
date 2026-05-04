import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String str : participant) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        for (String str : completion) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) - 1);
            }
        }
        
        for (String str : participant) {
            if (map.get(str) != 0) {
                return str;
            }
        }
        
        return null;
    }
}