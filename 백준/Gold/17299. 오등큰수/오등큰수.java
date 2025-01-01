import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       int[] data = new int[n];
       int[] count = new int[1000001];
       int[] num = new int[n];

       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       for (int i = 0; i < n; i++) {
           data[i] = Integer.parseInt(st.nextToken());
           count[data[i]]++;
       }

       Stack<Integer> sta = new Stack<>();
       for (int i = 0; i < n; i++) {

           while (!sta.isEmpty() && count[data[sta.peek()]] < count[data[i]]) {
               num[sta.pop()] = data[i];
           }

           sta.add(i);
       }

       while(!sta.isEmpty())
           num[sta.pop()] = -1;

       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < n; i++)
           sb.append(num[i]).append(" ");

       System.out.println(sb);
    }
}
