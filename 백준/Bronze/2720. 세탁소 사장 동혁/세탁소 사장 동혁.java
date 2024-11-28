import java.io.*;
/*
* 거스름돈은 n
* 순서대로 Q(0.25), D(0.10), N(0.05), P(0.01) 일 때,
* 순서대로 n/Q, n/D, n/N 그 나머지는 p로 계산해서 배열로 반환
* */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            double n = Double.parseDouble(br.readLine());
            int Q = (int)(n / 25);
            n = n % 25;

            int D = (int)(n / 10);
            n = n % 10;

            int N = (int)(n / 5);
            n = n % 5;

            int P = (int)(n % 5);

            System.out.println(Q + " " + D + " " + N + " " + P);
        }
    }

}