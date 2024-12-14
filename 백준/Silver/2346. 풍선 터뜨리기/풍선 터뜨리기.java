import java.io.*;
import java.util.*;

/*
1. peek() 배열에 적재
2. peek() 삭제
3. for (int i = 0; i < n-1; i++) 양수 -> addLast(remove())
4. for (int i = 0; i < n-1; i++) 음수 -> addFirst(removeLast())
 */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Deque<Integer> deq = new ArrayDeque<>();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 1; i <= n; i++) {
            deq.add(i);
            arr2[i-1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int num =deq.removeFirst();
            arr[i] = num;


            if (!deq.isEmpty() && arr2[num-1] > 0) {
                for (int j = 0; j < arr2[num-1]-1; j++)
                    deq.addLast(deq.removeFirst());
            }
            else if (!deq.isEmpty() && arr2[num-1] < 0) {
                for (int j = 0; j < Math.abs(arr2[num-1]); j++)
                    deq.addFirst(deq.removeLast());
            }
            else
                break;
        }

        for (int val : arr)
            System.out.print(val + " ");
    }
}