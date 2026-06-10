import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Deque<Integer> sta = new ArrayDeque<>();
        int[] result = new int[numbers.length];
        
        Arrays.fill(result, -1);
        
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                sta.push(i);
                continue;
            }
            
            while (!sta.isEmpty() && numbers[i] > numbers[sta.peek()]) {
                    result[sta.pop()] = numbers[i];
            }
            
            sta.push(i);
        }
        
        return result;
    }
}

/*
시간복잡도는 O(n) or O(n log n)까지.

이중 포어문으로 하면 시간초과 날 거 같음.

해결해야될 문제: 해당 배열 차례에서 자기보다 큰 숫자가 있는지, n으로 확인해야된다.
여기서 질문, 
1, set이나 map 같은 경우에는 이중포어해도 시간복잡도 O(1)이면 되는지?
    x

정답은? -> 모노토닉 스택 -> 스택안에서 항상 단조 증가 or 단조감소 유지하는 스택
즉, 

스택을 사용하기. 해당 배열 인덱스를 스택에다가 넣을거임.
처음에는 아무값이 없으니? 해당 스택을 넣기
이후 두 번째 배열의 값이 전 값보다 크면? 스택의 값 Pop한 뒤 배열에 넣기. 
*/