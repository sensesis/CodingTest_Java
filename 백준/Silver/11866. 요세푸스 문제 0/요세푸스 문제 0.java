import java.io.*;
import java.util.*;

/*
n-1번까지 for문
그리고 remove()한 값 배열에 적재
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deq = new ArrayDeque<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++)
            deq.addLast(i);

        while (deq.size() != 0) {
            for (int i = 0; i < k-1; i++)
                deq.addLast(deq.remove());
            arr.add(deq.remove());
        }

        sb.append("<");
        for (int i = 0; i < arr.size(); i++) {
            sb.append(arr.get(i));

            if(i != arr.size()-1)
                sb.append(", ");
        }
        sb.append(">");
        System.out.println(sb);
    }
}
