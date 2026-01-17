import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) { 
                String target = photo[i][j]; 
        
                    for (int k = 0; k < name.length; k++) {
                        if (name[k].equals(target)) {
                            answer[i] += yearning[k];
                break; 
            }
        }
    }
}
        return answer;
    }
}