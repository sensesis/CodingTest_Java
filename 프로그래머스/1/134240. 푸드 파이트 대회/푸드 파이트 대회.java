import java.util.*;
class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 == 0) {
                food[i] = food[i] / 2;
                
                for (int j = 0; j < food[i]; j++) {
                    sb.append(i);
                }
                continue;
            }
            
            food[i] = (food[i]-1) / 2;
            for (int j = 0; j < food[i]; j++) {
                    sb.append(i);
            }
        }
    
        sb.append(0);
        
        for (int i = food.length-1; i > 0; i--) {
            for (int j = food[i]; j > 0; j--) {
                    sb.append(i);
            }
        }
        
        return sb.toString();
        
    }
}

/*
?? -> 0번 물도 동일하게 적용되는지? -> 항상 1이라 함.
물응ㄹ 제외하고 1개라면? 사용 불가능, 그 이외 홀수면 -1로 짝수 맞추기
짝수의 / 2해서 각각 적용

그러면, 1 2 3 0 3 2 1 이 순으로 고정
for (문으로 ㄱㄱ)

*/