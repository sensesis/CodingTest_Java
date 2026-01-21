import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String calling : callings) {
            int currentRank = map.get(calling);
            String frontRank = players[currentRank - 1];
            
            players[currentRank - 1] = players[currentRank];
            players[currentRank] = frontRank;
            
            map.put(calling, currentRank - 1);
            map.put(frontRank, currentRank);
            
        }
        
        return players;
    }
}