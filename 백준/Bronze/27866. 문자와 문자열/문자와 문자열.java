import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        int n = Integer.parseInt(br.readLine()) - 1;

        System.out.println(st.charAt(n));
    }
}