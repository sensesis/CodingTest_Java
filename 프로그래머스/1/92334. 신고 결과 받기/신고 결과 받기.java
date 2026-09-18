import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> set = new HashSet<>();
        
        for (String str : report) {
            set.add(str);
        }
        
        Map<String,Integer> map = new HashMap<>();
        for (String str : set) {
            String s = str.split(" ")[1];
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        Map<String, Integer> list = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            list.put(id_list[i], i);
        }
        
        int[] answer = new int[id_list.length];
        for (String str : set) {
            String[] arr = str.split(" ");
            String repoter = arr[0];
            String s = arr[1];
            
            if (map.getOrDefault(s, 0) >= k) {
                answer[list.get(repoter)]++;
            }
        }
        
        return answer;
    }
}

/*
1. 각 유저는 한 번에 한 명 유저 신고가능
    - 신고 제한X, 서로 다른 유저 계속 가능
    - 동일한 유저는 1회 처리
    
2. k번 이상 신고된 경우 이용 정지.

Map으로 키 
*/