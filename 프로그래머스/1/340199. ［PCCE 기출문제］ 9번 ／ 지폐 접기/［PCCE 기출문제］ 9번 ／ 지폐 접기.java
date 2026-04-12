class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int maxWallet = Math.max(wallet[0], wallet[1]);
        int minWallet = Math.min(wallet[0], wallet[1]);
        
        while (Math.max(bill[0], bill[1]) > maxWallet || Math.min(bill[0], bill[1]) > minWallet) {
            if (bill[0] > bill[1]) {
                bill[0] = bill[0] / 2;
            } else {
                bill[1] = bill[1] / 2;
            }
            answer++;
        }
        
        return answer;
    }
}