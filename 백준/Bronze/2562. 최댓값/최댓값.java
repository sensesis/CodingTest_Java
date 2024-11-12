import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int max = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i] = Integer.parseInt(st.nextToken());

            if (arr[i] > max) {
                max = Math.max(max, arr[i]);
                count = (i + 1);
            }
        }

        System.out.println(max);
        System.out.println(count);
    }
}