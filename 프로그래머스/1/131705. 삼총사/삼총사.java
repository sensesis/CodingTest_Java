class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                for (int k = j+1; k < number.length; k++) {
                    if ((number[i] + number[j] + number[k]) == 0) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}

/*
시간복잡도는 3중 for문까지 가능함.
번호가 같을 수 있음.

1. 이중 for문
*/