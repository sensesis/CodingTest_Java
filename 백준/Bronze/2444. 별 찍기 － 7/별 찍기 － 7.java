import java.io.*;
/*
* 만약 5라면, 총 출력은 2 * n - 1개임
* n이 최대 별의 개수는 2*n-1
* 1. 3중 for문으로, 첫 for문은 전체 갯수를 의미함
* 2. j = n - i; -> " " 출력
* 3. k = 2*n-1까지 "*" 출력
* 4. l = n - i; -> " " 출력
* 5. 다시, 반대로,
* */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {

            for (int j = n - i; j > 0; j--)
                System.out.print(" ");

            for (int k = 0; k < (2*i)-1; k++)
                System.out.print("*");

            /*for (int l = n - i; l > 0; l--)
                System.out.print(" ");*/

            System.out.println();
        }

        for (int i = 1; i < n; i++) {

            for (int j = 1; j < (2+i)-1; j++)
                System.out.print(" ");

            for (int k = (2*(n-i)-1); k > 0; k--)
                System.out.print("*");

            /*for (int l = 1; l < (2+i)-1; l++)
                System.out.print(" ");*/

            System.out.println();
        }
    }
}