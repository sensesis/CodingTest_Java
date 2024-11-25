import java.io.*;

/*
* 기본 카운 = 문자열 갯수
* 만약, 해당 문자열이 특정 문자열 -> 이중 if 문으로 맞다면 count-1
* legth + 1 값을 넘기지 않게 for문에서 s.length() - 1 로 자정
* */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = s.length();

        for (int i = 0; i < s.length()-1; i++) {

            if (s.charAt(i) == 'c') {
                if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
                    i++;
                    count--;
                }
            }

            if (s.charAt(i) == 'd') {
                if (s.charAt(i + 1) == '-') {
                    i++;
                    count--;
                }

                else if (i + 2 < s.length() && s.charAt(i + 1) == 'z' && s.charAt(i+2) == '=') {

                    i+=2;
                    count-=2;
                }
            }

            if (s.charAt(i) == 'l') {
                if (s.charAt(i + 1) == 'j') {
                    i++;
                    count--;
                }
            }

            if (s.charAt(i) == 'n') {
                if (s.charAt(i + 1) == 'j') {
                    i++;
                    count--;
                }
            }

            if (s.charAt(i) == 's') {
                if (s.charAt(i + 1) == '=') {
                    i++;
                    count--;
                }
            }

            if (s.charAt(i) == 'z') {
                if (s.charAt(i + 1) == '=') {
                    i++;
                    count--;
                }
            }
        }
        System.out.println(count);
    }
}
