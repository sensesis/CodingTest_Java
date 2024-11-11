import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int i = 1;

        while (true) {

            if (i  > 9)
                break;
            System.out.println(n + " * " + i + " = " + n*i);
            i++;
        }
    }
}