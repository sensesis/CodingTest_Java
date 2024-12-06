import java.io.*;
import java.util.*;
/*
3키로 or 5키로

먼저 5키로로 다 나누고, 만약에 %3이 안되면, +5한다음 %나누기.
안되면 -1 되면 기존 로직 구현
*/

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;

        if (n / 5 != 0) {
            count += n / 5;
            n = n % 5;
        }

        while (n != 0) {

            if ((count == 0 && n == 4) || (count == 0 && n == 7)) {
                count = -1;
                break;
            }

            if (n / 3 != 0) {

                count += n / 3;
                n = n % 3;
            }

            else {
                n += 5;
                count--;
            }
        }

        System.out.println(count);
    }
}