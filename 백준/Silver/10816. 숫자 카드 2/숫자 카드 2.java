import java.io.*;
import java.util.*;
/*
merge 이용해서 누적합 계산
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            hm.put(num, hm.containsKey(num) ? hm.merge(num, 1, Integer::sum) : 1);
        }

        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (hm.containsKey(num))
                sb.append(hm.get(num)).append(" ");
            else
                sb.append(0).append(" ");
        }

        System.out.println(sb);
    }
}