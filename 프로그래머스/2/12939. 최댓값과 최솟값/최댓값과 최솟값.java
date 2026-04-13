import java.util.*;

class Solution {
    public String solution(String s) {
        int max = -9999;
        int min = 9999;
        
        String[] strArr = s.split(" ");
        
        for (String str : strArr) {
            int num = Integer.parseInt(str);
            
            if (max < num) max = num;
            if (min > num) min = num;
        }
        
        return min + " " + max;
    }
}



