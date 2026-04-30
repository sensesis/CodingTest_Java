class Solution {
    public int solution(String[][] board, int h, int w) {
        int result = 0;
        if (w > 0 && board[h][w-1].equals(board[h][w])) result++;
        if (h > 0 && board[h-1][w].equals(board[h][w])) result++;
        if (w < board[0].length-1 && board[h][w+1].equals(board[h][w])) result++;
        if (h < board.length-1 && board[h+1][w].equals(board[h][w])) result++;
        
        return result;
    }
}

/*
그 위치 기준으로 위아래옆오른쪽 대조해서 string.contains로 해서 맞으면 +1하면될듯?
예를들어서 내 기준에서?
왼쪽은 [][-1]
오른쪽은 [][+1]
위쪽은 [-1][]
아래쪽은 [+1][]

그러면, indexArrayoutofmemory 조심해야겠네. 조건문으로 하면 될거 같음.
예를들어서 왼쪽, 위쪽은 0, 오른쪽과 아래는 n을 기준으로 하면될듯
*/