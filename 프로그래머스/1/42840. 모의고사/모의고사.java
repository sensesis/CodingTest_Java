import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        int[] scores = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (a[i%a.length] == answers[i]) scores[0]++;
            if (b[i%b.length] == answers[i]) scores[1]++;
            if (c[i%c.length] == answers[i]) scores[2]++;
        }
 
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            if (scores[i] == maxScore) {
                list.add(i+1);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}