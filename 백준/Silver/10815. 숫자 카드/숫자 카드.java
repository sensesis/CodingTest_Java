import java.io.*;
import java.util.*;
/*
HashSet 사용, contains -> true = 1, false = 0
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++)
            hs.add(Integer.parseInt(st.nextToken()));

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            if (hs.contains(Integer.parseInt(st.nextToken())))
                sb.append(1).append(" ");
            else
                sb.append(0).append(" ");
        }

        System.out.println(sb);
    }
}
