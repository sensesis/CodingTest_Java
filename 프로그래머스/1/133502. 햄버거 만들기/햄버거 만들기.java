import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        ArrayList<Integer> arr = new ArrayList<>();
        int result = 0;
        for (int i : ingredient) {
            arr.add(i);
            
            if (arr.size() >= 4) {
                int len = arr.size();
                if (arr.get(len - 4) == 1 &&
                    arr.get(len - 3) == 2 &&
                    arr.get(len - 2) == 3 &&
                    arr.get(len - 1) == 1) {
                    
                    for (int j = 0; j < 4; j++) {
                        arr.remove(arr.size() - 1);
                    }
                    result++;
                }
            }
        }
        
        return result;
    }
}

/*
제약조건: 10^7이니깐, 0 log n까지 가능함.
빵 -> 야채 -> 고기 -> 빵
스택 -> 프링글스통
큐 -> 놀이공원 티켓

스택사용하기
빵 = 1
야채 = 2
고기 = 3

즉, 1,2,3,1이면? 해당 4개 지우고 +1하기
근데 이거를 계속 if문으로 하는거도 좀 그런데,, 이거에 대해서 해결할 수 있는 알고리즘이 있나?
-> ArrayList를 하면 되는거였음!!!! 
*/