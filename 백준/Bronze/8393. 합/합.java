import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int n = Integer.parseInt(br.readLine());
         int sum = 0;
         int[] arr = new int[n];

         for (int i = 0; i < arr.length; i++) {

             arr[i] = i + 1;
             sum += arr[i];
         }

         System.out.println(sum);
    }
}