import java.io.*;
import java.util.*;

/*
push X: 정수 X를 큐에 넣는 연산이다. -> add or offer
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다. -> poll
size: 큐에 들어있는 정수의 개수를 출력한다. -> size
empty: 큐가 비어있으면 1, 아니면 0을 출력한다. -> isEmpty
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다. -> peek()
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다. ->peekLast()
*/
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> que = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {

                case "push":
                    que.add(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(!que.isEmpty() ? que.poll() : -1).append('\n');
                    break;

                case "size":
                    sb.append(que.size()).append('\n');
                    break;

                case "empty":
                    sb.append(que.isEmpty() ? 1 : 0).append('\n');
                    break;

                case "front":
                    sb.append(!que.isEmpty() ? que.peek() : -1).append('\n');
                    break;

                case "back":
                    sb.append(!que.isEmpty() ? que.peekLast() : -1).append('\n');
                    break;
            }
        }

        System.out.println(sb);
    }
}
