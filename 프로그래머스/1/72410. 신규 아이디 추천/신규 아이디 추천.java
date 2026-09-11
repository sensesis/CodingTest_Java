import java.util.*;

class Solution {
    public String solution(String new_id) {
        String str = new_id;
        
        str = str.toLowerCase();
        str = str.replaceAll("[^a-z0-9\\-_.]", "");
        str = str.replaceAll("\\.{2,}", ".");
        str = str.replaceAll("^\\.|\\.$", "");
        
        if (str.isEmpty()) {
            str = "a";
        }
        
        if (str.length() >= 16) {
            str = str.substring(0, 15);
            if (str.endsWith(".")) {
                str = str.substring(0, 14);
            }
        }
        
        while (str.length() < 3) {
            str += str.charAt(str.length() - 1);
        }

        return str;
    }
}