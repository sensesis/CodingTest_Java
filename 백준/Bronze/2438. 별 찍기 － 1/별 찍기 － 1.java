import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            str += "*";
            System.out.println(str);
        }
    }
}