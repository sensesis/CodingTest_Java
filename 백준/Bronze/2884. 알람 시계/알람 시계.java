import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
* 만약에 m이 45보다 낮다면, (60 - 45)++ , 그게 아니라면 그냥 빼기
* 그리고 낮다면, h--
* h--를 했는데, h가 0이라면? (24 - 1) or 23
*
* */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int h = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        if (m < 45) {
            m += 15;
            if (h == 0)
                h = 23;
            else
                h--;
        }
        else
            m -= 45;

        System.out.println(h + " " + m);
    }
}