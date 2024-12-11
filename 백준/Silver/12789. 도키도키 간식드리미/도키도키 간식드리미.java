import java.io.*;
import java.util.*;

/*
count = 1
if (stack이 count와 맞으면)
count++;

else (그게 아니라면)
sta.push

for (sta.size())
if (count != sta.peek())
    break;
else
    sta.pop()
    count++
*/

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> sta = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = 1;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (count == num)
                count++;
            else
                sta.push(num);

            if  (!sta.isEmpty() && count == sta.peek()) {
                while (true) {

                    if (!sta.isEmpty() && count == sta.peek()) {
                        count++;
                        sta.pop();
                    }
                    else
                        break;
                }
            }
        }

        int size = sta.size();
        if (!sta.isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (count == sta.peek()) {
                    count++;
                    sta.pop();
                }
                else
                    break;
            }

            if (sta.isEmpty())
                System.out.println("Nice");
            else
                System.out.println("Sad");
        }

        else
            System.out.println("Nice");
    }
}
