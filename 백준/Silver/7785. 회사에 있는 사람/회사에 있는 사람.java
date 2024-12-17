import java.io.*;
import java.util.*;
/*
HashMap<Stirng, boolean or Integer> 사용
contains로 해당 이름이 있다면 뒤에 이름 판단해서 함
그 후 두 번째 값 판단으로 리스트 뽑음. 이걸 역순으로 뽑기
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Boolean> hm = new HashMap<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String status = st.nextToken();

            hm.put(name,  status.equals("enter") ? true : false);
        }

        ArrayList<String> arr = new ArrayList<>();

        for (String key : hm.keySet()) {
            if (hm.get(key))
                arr.add(key);
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.size(); i++)
            System.out.println(arr.get(i));
    }
}
