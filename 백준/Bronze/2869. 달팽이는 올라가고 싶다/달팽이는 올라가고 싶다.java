import java.io.*;
import java.util.*;

/*
* while (num >= v)
* for 문 돌 때 마다, num + a, num - b
* 그런데 제한 시간이 0,25초라 되는지 모르겠음.
* */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
    
        int count = (v - b) / (a-b);

        if ((v - b) % (a-b) != 0)
            count++;

        System.out.println(count);
    }
}
