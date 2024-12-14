import java.io.*;
import java.util.*;
/*
1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000) -> add
2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000) -> addLast
3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다. -> remove
4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다. -> removeLast
5: 덱에 들어있는 정수의 개수를 출력한다. -> size
6: 덱이 비어있으면 1, 아니면 0을 출력한다. -> isEmpty
7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다. peek
8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다. -> peekLast
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        Deque<Integer> deq = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            switch(Integer.parseInt(st.nextToken())) {
                case 1:
                    deq.addFirst(Integer.parseInt(st.nextToken()));
                    break;

                case 2:
                    deq.addLast(Integer.parseInt(st.nextToken()));
                    break;

                case 3:
                    sb.append(!deq.isEmpty() ? deq.remove() : -1).append('\n');
                    break;

                case 4:
                    sb.append(!deq.isEmpty() ? deq.removeLast() : -1).append('\n');
                    break;

                case 5:
                    sb.append(deq.size()).append('\n');
                    break;

                case 6:
                    sb.append(deq.isEmpty() ? 1 : 0).append('\n');
                    break;

                case 7:
                    sb.append(!deq.isEmpty() ? deq.peek() : -1).append('\n');
                    break;

                case 8:
                    sb.append(!deq.isEmpty() ? deq.peekLast() : -1).append('\n');
                    break;

                default:
                    break;
            }
        }

        System.out.println(sb);
    }
}
