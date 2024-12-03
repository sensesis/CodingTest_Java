import java.io.*;
import java.util.*;
/*
for (i = 0; i < n; i++)
n * k == 0 -> 배열에 i값 적재
출력값에 arr[k-1]값 출력
*/
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (n % i == 0 || i == 1)
                arr.add(i);
        }

        if (k > arr.size())
            System.out.println("0");

        else
            System.out.println(arr.get(k-1));
    }
}