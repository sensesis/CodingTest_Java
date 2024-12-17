import java.io.*;
import java.util.*;

/*
HashSet 사용 (맵까진 필요x)
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> hs = new HashSet<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++)
            hs.add(br.readLine());

        StringBuilder sb = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String str = br.readLine();

            if(hs.contains(str))
                arr.add(str);
        }

        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++)
            sb.append(arr.get(i)).append("\n");

        System.out.println(arr.size());
        System.out.println(sb);
    }
}
