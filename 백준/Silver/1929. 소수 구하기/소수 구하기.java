import java.io.*;
import java.util.*;
/*
에라토스 테네스의 체 알고리즘 사용
arr[M] ~ arr[N]의 배열에 소수 판별 후 출력
*/
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean arr[] = new boolean[1000001];

        for (int i = 0; i < arr.length; i++)
            arr[i] = true;

        arr[0] = arr[1] = false;

        for (int i = 2; i < Math.sqrt(arr.length); i++) {

            if (arr[i]) {

                for (int j = i*i; j < arr.length; j += i)
                    arr[j] = false;
            }
        }

        for (int i = m; i <= n; i++) {

            if (arr[i] == true)
                System.out.println(i);
        }
    }
}