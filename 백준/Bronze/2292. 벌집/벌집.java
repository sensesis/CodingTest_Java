import java.io.*;
/*
* 1 ~ 7 (6) - 1
8 ~ 19 (12) - 2
20 ~ 37 (18) - 3
38 ~ 61(24) - 4
25일 때,
* 1. 6
* 2 12
* 3 18
* 4 24
*
* */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 1;
        int i = 1;
        int count = 1;

        if (n == 1)
            count = 1;

        else {

            while (true) {

                if (n <= num)
                    break;

                num += (i++ * 6);
                count++;
            }
        }

        System.out.println(count);
    }
}
