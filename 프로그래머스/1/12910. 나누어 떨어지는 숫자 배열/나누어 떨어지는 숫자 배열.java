import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        
        if (list.isEmpty()) {
            return new int[] {-1};
        }
        
        Collections.sort(list);
        int[] answer = new int[list.size()];
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(count);
            count++;
        }
        
        return answer;
    }
}