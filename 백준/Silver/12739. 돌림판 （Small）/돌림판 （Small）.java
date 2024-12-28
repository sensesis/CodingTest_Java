import java.io.*;
import java.util.*;
/*
1. 본인 +-1 위치가 같은 색 or 다른색이다? -> 파란색
2. 빨 초, 초 파, 파 빨인 경우
    -> 한가지라도 만족한다? 빨강
3. 초 빨, 파 초, 빨 파면 초록색
4. 덱 쓰면 될듯?? 원형큐는 나 잘 모르니깐 굿 그리고 원형큐 쓰레기임. 벡터써도 야무질 거 같은데
일단 덱으로 구현해봅시다.
 */

public class Main {

    public static char Solution(char left, char curr, char right) {

        if ((left == curr && curr == right)
                || (left != curr && curr != right && left != right)) {
            return 'B';
        }
        else if (
            // (X=R, Y=G)의 모든 경우 (R,R,G), (R,G,R), (G,R,R)
                (left=='R' && curr=='R' && right=='G') ||
                 (left=='R' && curr=='G' && right=='R') ||
                 (left=='G' && curr=='R' && right=='R') ||

                 (left=='G' && curr=='G' && right=='B') ||
                 (left=='G' && curr=='B' && right=='G') ||
                 (left=='B' && curr=='G' && right=='G') ||

                 (left=='B' && curr=='B' && right=='R') ||
                 (left=='B' && curr=='R' && right=='B') ||
                 (left=='R' && curr=='B' && right=='B')) {
            return 'R';
        }
        else {
            return 'G';
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String str = br.readLine();

        Deque<Character> dq = new ArrayDeque<>();
        for (int i = 0; i < n ; i++) {
            dq.addLast(str.charAt(i));
        }

        while (k-- != 0) {
            char[] next = new char[n];
            Character[] arr = dq.toArray(new Character[0]);

            for (int i = 0; i < n; i++) {
                char left = (i == 0) ? arr[n - 1] : arr[i - 1];
                char curr = arr[i];
                char right = (i == n - 1) ? arr[0] : arr[i + 1];
                next[i] = Solution(left, curr, right);
            }


            dq.clear();
            for (int i = 0; i < n; i++) {
                dq.addLast(next[i]);
            }
        }

        int R = 0, G = 0, B = 0;
        for (char c : dq) {
            if (c == 'R') R++;
            else if (c == 'G') G++;
            else B++;
        }

        System.out.println(R + " " + G + " " + B);
    }
}