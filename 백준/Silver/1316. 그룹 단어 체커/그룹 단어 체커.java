import java.io.*;
import java.util.Arrays;
/*
* Boolean을 사용, 총 26개의 int형 배열을 선언
* 각각의 아스키코드를 사용하여 배열 위치를 지정
* 한 번 사용된 문자는 false -> true로 변경
* 만약 i - 1이 같은 문자 && 해당 배열이 true이면? -> 넘어감
*  만약 i - 1이 같은 문자가 아니며, && 해당 배열이 true이면? -> break
*
* i - 1의 값을 사용하니깐, StirngIndex에러가 안뜨게 조심!
* */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = n;
        for (int i = 0; i < n; i++) {
            
            Boolean[] barr = new Boolean[26];
            Arrays.fill(barr, Boolean.FALSE);
            String str = br.readLine();

            for (int j = 0; j < str.length() - 1; j++) {

                barr[str.charAt(j)-97] = true;

                if (str.charAt(j) == str.charAt(j+1) && barr[str.charAt(j+1)-97] == true)
                    continue;

                if (str.charAt(j) != str.charAt(j+1) && barr[str.charAt(j+1)-97] == true) {
                    count--;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}