import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
* 만약 b + c 가 60을 안넘어간다?
* 그러면 b+c
* 그게 아니라면, (b + c) - 60
* a++
* */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(br.readLine());

        if ((b + c) >= 60) {
            a =  a + ((b+c) / 60);
            b = ((b+c) % 60);

            if (a > 23)
                a -= 24;
        }

        else
            b += c;

        System.out.println(a + " " + b);

    }
}
