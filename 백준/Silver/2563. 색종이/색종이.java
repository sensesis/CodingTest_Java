import java.io.*;
import java.util.*;

/*
* 각 좌표의 값을 받아 해당 배열을 기준으로 10*10을 boolean으로 표시
* 입력값에 띄어쓰기가 있으니 StringTokenizer 사용
* 중복되면 continue
* 마지막에 처음부터 끝까지 ture일때 count++
* */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] arr = new boolean[100][100];
        int num = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < num; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());

            for (int j = row; j < row + 10; j++) {

                if (j > 100)
                    continue;
                for (int k = col; k < col + 10; k++){

                    if (k > 100 || arr[j][k] == true)
                        continue;

                    arr[j][k] = true;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {

                if (arr[i][j] == true)
                    count++;
            }
        }

        System.out.println(count);
    }
}
