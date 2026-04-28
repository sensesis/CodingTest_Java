import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);
        }

        int count = 0;
        for (int i = 0; i < (m * (score.length / m)); i++) {
            count++;
            if (count % m == 0) {
                result += pq.poll() * m * 1;
                continue;
            }
            pq.poll();
        }
        
        return result;
    }
}

/*
제약조건: n7이니깐 n log n, n이 최대
우선순위 큐가 생각남. n log n

reversesort하고?
poll, poll, 마지막꺼만 가져오기.
*/