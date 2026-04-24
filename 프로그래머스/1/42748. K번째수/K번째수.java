import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int count = commands.length;
        int[] answer = new int[count];
        
        for (int i = 0; i < commands.length; i++) {
            int fir = commands[i][0];
            int end = commands[i][1];
            int k =  commands[i][2] - 1;
            int[] arr = Arrays.copyOfRange(array, fir-1, end);
            
            Arrays.sort(arr);
            answer[i] = arr[k];
        }
        
        return answer;
    }
}

/*
제약조건은 따로 제약조건은 없음
command에서 2, 5, 3 = 2~5번째의 배열에서 3번째 값을 찾아라.
즉, array는 반복 (while로 깔끔하게 돌리기)
자르는거는 substring으로 자르기, 그리고 sort한 뒤, 해당 배열 찾기
*/