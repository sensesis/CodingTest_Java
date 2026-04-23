class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();

        int count = 0;
        for (char ch : s.toCharArray()) {
            
            if (ch == ' ') {
                answer += ch;
                count = 0;
            }
            else if (count % 2 == 0) {
                answer += String.valueOf(ch).toUpperCase();
                count++;
            }
            else if (count % 2 != 0) {
                answer += String.valueOf(ch);
                count++;
            }
            
            System.out.println(answer);
            System.out.println("count = " + count);
        }
        
        return answer;
    }
}