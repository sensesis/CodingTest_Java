import java.io.*;
import java.util.*;

/*
1 제외 소수 구하기
에라토스테네스의 체 사용해서 풀기 - 기본기 증가 목표
*/

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        boolean[] arr = new boolean[1001];

        for (int i = 0; i < arr.length; i++)
            arr[i] = true;

        arr[0] = arr[1] = false;

        for (int i = 2; i < Math.sqrt(arr.length); i++) {

            if (arr[i]) {
                for (int j = i*i; j < arr.length; j += i)
                    arr[j] = false;
            }
        }

        while (st.hasMoreTokens()) {

            if (arr[Integer.parseInt(st.nextToken())])
                count++;
        }

        System.out.println(count);
    }
}
