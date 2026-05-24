import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++) {
            q.add(new int[]{priorities[i], i});
            pq.add(priorities[i]);
        }
        
        int count = 0;
        
        while (!q.isEmpty()) {
            int[] current = q.poll();
            if (current[0] == pq.peek()) {
                count++;
                pq.poll();
                
                if (current[1] == location) {
                    return count;
                }
            } else {
                q.add(current);
            } 
        }
        
        return 0;
    }
}

/*
저거 우선순위가 즉, 무조건 예를들어서 중복될경우 안에 문자열 값을 기준으로가 아닌? 진짜 우선순위 큐네?
질문. 이거를 그냥 정말 우선순위 큐로 풀면 되는지?

1. [2, 1, 3, 2]일때, 우선순위 큐는 어떻게 되는지 궁금함. 

priorityQueue를 사용하고, int[] 배열로 안에 순서를 만들자. 

걍 차라리, 우선순위큐로 하고? 이제 그 안에 값이 키값은 반대로 하는거는 되나? 
*/