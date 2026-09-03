import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int len = 0; len < commands.length; len++) {
            int i = commands[len][0];
            int j = commands[len][1];
            int k = commands[len][2];
            
            int[] arr = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(arr);
            answer[len] = arr[k-1];
        }
        
        return answer;
    }
}