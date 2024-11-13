import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[30];

        for (int i = 0; i < 28; i++) {

            int n = Integer.parseInt(br.readLine());
            arr[n - 1] = 1;
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 1)
                System.out.println((i+1));
        }
    }
}