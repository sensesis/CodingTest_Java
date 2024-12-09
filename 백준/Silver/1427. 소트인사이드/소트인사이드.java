import java.io.*;
import java.util.*;

/*
1. string으로 문자를 받음
2. 해당 문자를 charAt()으로 다시 배열로 변경
3. 해당 n의 크기가 1억개이니 Collections.sort();
*/

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<Character> arr = new ArrayList<>();

        for (int i = 0; i < str.length(); i++)
            arr.add(str.charAt(i));

        Collections.sort(arr, Collections.reverseOrder());

        for (char ch : arr)
            System.out.print(ch);
    }
}