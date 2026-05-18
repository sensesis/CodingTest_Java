class Solution {
    public String solution(String s) {
        String answer = "";

        boolean flag = true;
        String[] strArr = s.toLowerCase().split("");
        
        for (String str : strArr) {
            answer += flag ? str.toUpperCase() : str;
            flag = str.equals(" ") ? true : false;
        }
                
        return answer;
    }
}