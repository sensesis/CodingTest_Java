import java.util.*;

class Solution {
    public String solution(String s) {
        char[] chArr = s.toCharArray();
        Arrays.sort(chArr);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chArr.length; i++) {
            sb.append(chArr[i]);
        }
        
        return sb.reverse().toString();
    }
}

/*
String -> char[] -> 내림차순 -> String 이어서붙이기

1. String -> Char[] -> int[] -> 내림차순 -> Char[] -> Stirng
2. String -> Char[] -> sb.append().reverse
*/