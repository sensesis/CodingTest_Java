import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = (i+1);

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int temp = 0;

            temp = arr[x-1];
            arr[x-1] = arr[y-1];
            arr[y-1] = temp;
        }

        for (int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");
    }
}