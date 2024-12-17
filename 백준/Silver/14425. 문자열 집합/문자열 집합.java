import java.io.*;
import java.util.*;
/*
n = hashSet
for 문으로 찾아서 있으면 ++
 */
public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> hs = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++)
            hs.add(br.readLine());

        int count = 0;

        for (int i = 0; i < m; i++) {
            if (hs.contains(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }
}