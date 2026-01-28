class Solution {
    
    int[][] numPhone = {
        {3,1},
        {0,0},
        {0,1},
        {0,2},
        {1,0},
        {1,1},
        {1,2},
        {2,0},
        {2,1},
        {2,2},
        {3,0},
        {3,2}
    };
    
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left = 10;
        int right = 11;
        
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                sb.append("L");
                left = num;
            }
            else if (num == 3 || num == 6 || num == 9) {
                     sb.append("R");
                     right = num;
            }
            else {
                int leftL = getDistance(left, num);
                int rightR = getDistance(right, num);
                
                if (leftL < rightR) {
                    sb.append("L");
                    left = num;
                }
                else if (rightR < leftL) {
                    sb.append("R");
                    right = num;
                }
                else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        left = num;
                    }
                    else {
                        sb.append("R");
                        right = num;
                    }
                }
            }
        }
        
        return sb.toString();
    }
    
    private int getDistance(int handnum, int n) {
        int r1 = numPhone[handnum][0];
        int c1 = numPhone[handnum][1];
        int r2 = numPhone[n][0];
        int c2 = numPhone[n][1];
        
        return Math.abs(r1 - r2) + Math.abs(c1 - c2);
    }
    
    
}