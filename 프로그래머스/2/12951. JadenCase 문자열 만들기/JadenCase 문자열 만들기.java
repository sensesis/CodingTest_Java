import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isStart = true;
        
        for (String str : s.split("")) {
            if (isStart) {
                sb.append(str.toUpperCase());
                isStart = false;
            }
            else {
                sb.append(str.toLowerCase());
            }
            
            if (str.equals(" ")) {
                isStart = true;
            }
        }
        
        return sb.toString();
    }
}