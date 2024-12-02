import java.io.*;
import java.util.*;

/*
* 10진법이 문제.
* 만약 ZZZZZ라면, Z = 35, 아스키코드로는 90, 즉 -55
* 만약 0 ~ 9라면, 아스키 코드는 -48 or -'0'
* */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int num = 0;
        int sum = 0;
        int count = 0;
        for (int i = n.length()-1; i >= 0; i--) {

            char ch = n.charAt(i);

            if (ch >= '0' && ch <= '9')
                num = ch - '0';

            else
                num = ch - 55;

            sum += num * Math.pow(b, count++);
        }

        System.out.println(sum);
    }
}
