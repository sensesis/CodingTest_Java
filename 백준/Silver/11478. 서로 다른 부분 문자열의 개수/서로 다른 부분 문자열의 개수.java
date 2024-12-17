import java.io.*;
import java.util.*;
/*
이중 for문으로 구하기
subString을 사용하여 구하기.
HashSet을 사요하여 중복제거
 */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> hs = new HashSet<>();
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++)
                hs.add(str.substring(i, j));
        }

        System.out.println(hs.size());
    }
}