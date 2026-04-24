import java.util.*;

class Solution {
    public int solution(String s) {
        String answer = "";
        
        // 1. 영단어를 숫자로 바꾸기 위한 맵
        HashMap<String, String> strMap = new HashMap<>();
        strMap.put("zero", "0");
        strMap.put("one", "1");
        strMap.put("two", "2");
        strMap.put("three", "3");
        strMap.put("four", "4");
        strMap.put("five", "5");
        strMap.put("six", "6");
        strMap.put("seven", "7");
        strMap.put("eight", "8");
        strMap.put("nine", "9");

        // 2. 숫자를 영단어로 바꾸기 위한 맵 (네 로직 유지를 위해 전체 작성)
        HashMap<String, String> numMap = new HashMap<>();
        numMap.put("0", "zero");
        numMap.put("1", "one");
        numMap.put("2", "two");
        numMap.put("3", "three");
        numMap.put("4", "four");
        numMap.put("5", "five");
        numMap.put("6", "six");
        numMap.put("7", "seven");
        numMap.put("8", "eight");
        numMap.put("9", "nine");

        StringBuilder sb = new StringBuilder();
        
        // String을 순회하기 위해 char 배열로 변환
        for (char ch : s.toCharArray()) {
            sb.append(ch);
            String str = sb.toString();
            
            // 영단어 맵에 있는지 확인
            if (strMap.containsKey(str)) {
                answer += strMap.get(str);
                sb.setLength(0); // StringBuilder 비우기
            } 
            // 숫자 맵에 있는지 확인 (입력값이 '1', '2' 등 숫자일 때 처리)
            else if (numMap.containsKey(str)) {
                answer += str; // 숫자는 변환 없이 그대로 추가
                sb.setLength(0);
            }
        }
        
        // 최종 문자열 결과를 정수로 변환하여 반환
        return Integer.parseInt(answer);
    }
}