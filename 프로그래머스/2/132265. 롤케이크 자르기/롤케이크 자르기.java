import java.util.*;

class Solution {
    public int solution(int[] topping) {
        HashSet<Integer> me = new HashSet<>();
        HashMap<Integer, Integer> sister = new HashMap<>();

        for (int idx : topping) {
            sister.put(idx, sister.getOrDefault(idx, 0) + 1);
        }

        int answer = 0;

        for (int idx : topping) {
            me.add(idx);
            sister.put(idx, sister.get(idx) - 1);
            if (sister.containsKey(idx)) {
                if (sister.get(idx) == 0) {
                    sister.remove(idx);
                }
            }
            if (me.size() == sister.size()) {
                answer++;
            }
        }        

        return answer;
    }
}

/*
set으로 me, sister 2개 만들기
me는 배열에따라 하나씩 추가하고?
sister는 그 배열을 삭제하기
하고나서 안에 크기 비교, 맞다면? +1
*/