import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [][]arr = new char[5][15];
        String str = "";
        for (int i =  0; i < 5; i++) {

            str = br.readLine();

            for (int j = 0; j < str.length(); j++) {

                arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < 15; i ++) {
            for (int j = 0; j < 5; j++) {

                if (arr[j][i] == '\u0000')
                    continue;

                System.out.print(arr[j][i]);
            }
        }
    }
}
