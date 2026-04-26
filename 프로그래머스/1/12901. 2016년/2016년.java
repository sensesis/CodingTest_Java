class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] dayCount = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalCount = 0;
        
        for (int i = 0; i < a-1; i++) {
            totalCount += dayCount[i];
        }
        
        totalCount += (b - 1);

        return day[totalCount % 7];
    }
}
/*
3v

1월 31일이면 4 = 수 

5월 24면 152
*/