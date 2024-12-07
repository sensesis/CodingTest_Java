import java.io.*;
import java.util.*;

/*
내림차순 구현이 간단한 ArrayList 사용 (Collections.reverseOrder())
내림차순 후 arr.get(k-1)로 k번째 배열 추출
*/
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++)
            arr.add(Integer.parseInt(st.nextToken()));

        Collections.sort(arr, Collections.reverseOrder());

        System.out.println(arr.get(k-1));
    }
}
