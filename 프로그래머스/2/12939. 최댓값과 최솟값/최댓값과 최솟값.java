import java.util.*;

class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (String str : strArr) {
            int num = Integer.parseInt(str);
            arr.add(num);
        }
        
        Collections.sort(arr);
        
        return arr.get(0) + " " + arr.get(arr.size()-1);
    }
}