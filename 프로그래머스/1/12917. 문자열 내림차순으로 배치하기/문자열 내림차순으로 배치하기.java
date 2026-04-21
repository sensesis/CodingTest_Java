import java.util.*;

class Solution {
    public String solution(String s) {
        char[] chArr = s.toCharArray();
        Arrays.sort(chArr);
        
        return new StringBuilder(new String(chArr)).reverse().toString();
    }
}

/*
String -> char[] -> 내림차순 -> String 이어서붙이기

1. String -> Char[] -> int[] -> 내림차순 -> Char[] -> Stirng
2. String -> Char[] -> sb.append().reverse
*/