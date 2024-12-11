import java.io.*;
import java.util.*;
/*
if (push -> ")" 일때, peek()가 "("면? pop);
*/
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<Character> sta = new Stack<>();
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (ch == ')')
                    if (!sta.isEmpty() && sta.peek() == '(')
                        sta.pop();
                    else
                        sta.push(ch);
                else
                    sta.push(ch);
            }

            if (sta.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
