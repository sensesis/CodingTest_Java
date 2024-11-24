import java.io.*;
import java.util.*;
/*
* 해당 숫자를 빼고 남은 숫자를 출력
* */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < arr.length; i++) {

            int value = Integer.parseInt(st.nextToken());
            System.out.print(arr[i] - value + " ");
        }
    }
}
