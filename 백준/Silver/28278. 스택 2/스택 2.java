import java.io.*;
import java.util.*;
/*
1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000) -> push
2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다. -> pop
3: 스택에 들어있는 정수의 개수를 출력한다. -> size
4: 스택이 비어있으면 1, 아니면 0을 출력한다. -> empty
5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다. -> peek

for 문 사용, switch문 사용
*/
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> s = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch(Integer.parseInt(st.nextToken())) {

                case 1:
                    s.push(Integer.parseInt(st.nextToken()));
                    break;

                case 2:
                    if (!s.empty())
                        System.out.println(s.pop());
                    else
                        System.out.println(-1);
                    break;

                case 3:
                    System.out.println(s.size());
                    break;

                case 4:
                    if (s.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;

                case 5:
                    if (!s.isEmpty())
                        System.out.println(s.peek());
                    else
                        System.out.println(-1);
                    break;

                default:
                    break;
            }
        }
    }
}
