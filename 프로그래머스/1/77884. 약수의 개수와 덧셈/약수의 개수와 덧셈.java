class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int count = 0;
            
            for (int j = 1; j <= i; j++) {
                
                if (i % j == 0) {
                    count++;
                }
            }
            
            if (count % 2 == 0) {
                answer += i;
            }
            else {
                answer -= i;
            }
        }
        
        return answer;
    }
}

/*
1. 약수 구하기 - 되는 숫자 Count++;
2. 약수 짝수 홀수 판단
3. 짝수면 +, 홀수면 -

제약조건 x, 완전탐색 가능
*/