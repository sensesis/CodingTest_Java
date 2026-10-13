class Solution {
    public int[] solution(String[][] places) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        int[] answer = new int[places.length];
        int count = places.length;
        
        while (count != 0) {
            int num = places.length - count;
            String[] place = places[num];
            int ok = 1;
            
            for (int i = 0; i < 5 && ok == 1; i++) {
                for (int j = 0; j < 5 && ok == 1; j++) {
                    char ch = place[i].charAt(j);
                    
                    if (ch == 'X') {
                        continue;
                    }
                    
                    int pCount = 0;
                    for (int k = 0; k < 4; k++) {
                        int ni = i + dr[k];
                        int nj = j + dc[k];
                        
                        if (ni < 0 || nj < 0 || ni >= 5 || nj >= 5) {
                            continue;
                        }
                        if (place[ni].charAt(nj) == 'P') {
                            pCount++;
                        }
                    }
                    
                    if ((ch == 'P' && pCount >= 1) || (ch == 'O' && pCount >= 2)) {
                        ok = 0;
                    }
                }
            }
            
            answer[num] = ok;
            count--;
        }
        
        return answer;
    }
}

/*
1. p 기준 상하좌우가 p가 있는경우
2. o 기준, 상하좌우에 p가 2개 있는 경우 

while 문으로 하나씩 계산하기

만약 해당 위치가 없다면? 
ex) 0 0 이면, -1 -1이 안되니깐? 그거 신경쓰기

*/