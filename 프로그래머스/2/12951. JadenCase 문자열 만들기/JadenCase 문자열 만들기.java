class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        // 첫 글자는 무조건 대문자여야 하니까 true로 시작
        boolean isStartOfWord = true;

        // s.split("") : 한 글자씩 쪼갠다 (공백 포함)
        for (String cur : s.split("")) {
            // 1. 현재 글자가 대문자로 변해야 하는 타이밍인가?
            if (isStartOfWord) {
                sb.append(cur.toUpperCase());
            } else {
                sb.append(cur.toLowerCase());
            }

            // 2. 다음 글자를 위한 판단
            // 현재 글자가 공백(" ")이라면 -> 다음 글자는 단어의 시작이다! (Flag = true)
            if (cur.equals(" ")) {
                isStartOfWord = true;
            } else {
                // 공백이 아니라면 -> 다음 글자는 단어의 중간이다. (Flag = false)
                isStartOfWord = false;
            }
        }

        return sb.toString(); // subString 아님
    }
}