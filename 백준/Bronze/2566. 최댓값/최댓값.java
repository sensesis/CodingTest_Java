import java.io.*;
import java.util.*;

/**
 * 2차원 배열로 값을 적재함.
 * 적재하면서 매 Math.max()를 이용
 */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int max = 0;
        int row = 0;
        int col = 0;

        for (int i = 0; i < 9; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < 9; j++) {

                arr[i][j] = Integer.parseInt(st.nextToken());

                if (arr[i][j] >= max) {
                    max = arr[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + col);
    }
}