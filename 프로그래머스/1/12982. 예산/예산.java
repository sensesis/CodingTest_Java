import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;

        for (int i = 0; i < d.length; i++) {
            if (budget - d[i] < 0) {
                break;
            }
            budget -= d[i];
            answer++;
        }
        
        return answer;
    }
}

/*
1. 1000원 신청 부서는 정확히 1000 지원해야함. 적은 금액 지원 x
2. 오름차순으로 하고 순서대로 빼기
3. 완전탐색 or HashSet이나 Map으로 하기
*/