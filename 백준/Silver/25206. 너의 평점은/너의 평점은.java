import java.io.*;
/*
* 배열 형식인 split을 사용
* tokens[1] -> double형으로 변환
* tokens[2] -> 문자열 형식에 맞게 double형으로 변환
* tokens[1] * tokens[2]을 sum에 누적
* 추후 나머지 전공평점을 더해서 나누기
* */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String[] tokens;
        double token1 = 0.0;
        double token2 = 0.0;
        double sum = 0;
        double num = 0;

        for (int i = 0; i < 20; i++) {

            str = br.readLine();
            tokens = str.split(" ");
            token1 = Double.parseDouble(tokens[1]);

            if (tokens[2].equals("P"))
                continue;

            switch(tokens[2]) {

                case "A+":
                    token2 = 4.5;
                    break;

                case "A0":
                    token2 = 4.0;
                    break;

                case "B+":
                    token2 = 3.5;
                    break;

                case "B0":
                    token2 = 3.0;
                    break;

                case "C+":
                    token2 = 2.5;
                    break;

                case "C0":
                    token2 = 2.0;
                    break;

                case "D+":
                    token2 = 1.5;
                    break;

                case "D0":
                    token2 = 1.0;
                    break;

                case "F":
                    token2 = 0.0;
                    break;
            }

            sum += (token1 * token2);
            num += token1;
        }

        System.out.printf("%.6f", (sum/num));
    }
}
