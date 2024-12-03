import java.io.*;
import java.util.*;
/*
while (num >= token2) 일때까지
num += token1
if (num == token2)
-> factor

else
token1 % token2 == 0 -> multiple

아니면 neither
*/

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0)
                break;

            else if (a > b) {

                if (a % b == 0)
                    System.out.println("multiple");
                else
                    System.out.println("neither");
            }

            else if (a < b) {

                if (b % a == 0)
                    System.out.println("factor");
            }
        }
    }
}
