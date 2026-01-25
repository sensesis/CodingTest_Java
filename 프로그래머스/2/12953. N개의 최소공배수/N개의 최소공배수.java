class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while (true) {
            boolean isTrue = true;
            answer++;
            for (int i = 0; i < arr.length; i++) {
                if (answer % arr[i] != 0) {
                    isTrue = false;
                    break;
                }
            }
            
            if (isTrue) {
                break;
            }
        }
        
        return answer;
    }
}