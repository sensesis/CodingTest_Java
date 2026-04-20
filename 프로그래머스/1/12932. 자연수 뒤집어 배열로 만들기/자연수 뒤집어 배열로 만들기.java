class Solution {
    public int[] solution(long n) {
        
        String str = String.valueOf(n);
        String reversed = new StringBuilder(str).reverse().toString();
        int[] answer = new int[reversed.length()];
        int i = 0;

        for (char ch : reversed.toCharArray()) {
            answer[i++] = Character.getNumericValue(ch);
        }

        return answer;
    }
}

/*
제약조건 = 완전탐색만 가능, 근데 궁금증, 그러면 sort가 안되나?
sort하면 안되네. 그러면 그냥 for문으로? 아까처럼 반대로 하면 될듯?
*/