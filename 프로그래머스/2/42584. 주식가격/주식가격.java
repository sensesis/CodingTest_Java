class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                count++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            
            answer[i] = count;
        }
        
        return answer;
    }
}

/*
시간복잡도 O(n log n)까지 가능
자기 기준으로 
*/