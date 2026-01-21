class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (char ch : s.toCharArray()) {
            char temp = ch;
            int n = 0;
            
            while (n < index) {
                temp++;
                
                if (temp > 'z') {
                    temp -= 26;
                }
                
                if (skip.contains(String.valueOf(temp))) {
                    continue;
                }
                
                n++;
            }
            answer.append(temp);
        }
        
        return answer.toString();
    }
}