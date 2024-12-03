import java.io.*;
import java.util.*;
/*
while(n < 0)
n % i == 0 -> ArrayList 적재

for (sum += ArrayList.get(i))
sum == num -> 약수 합 출력
sum != num ->  n is NOT perfect 출력
*/

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            int count = 0;
            ArrayList<Integer> arr = new ArrayList<>();

            if (n == -1)
                break;

            for (int i = 1; i < n; i++) {

                if (n % i == 0 || n == 1)
                    arr.add(i);
            }

            for (int i = 0; i < arr.size(); i++) {

                sum += arr.get(i);
                count++;
            }

            if (sum == n) {

                System.out.print(n + " = " + arr.get(0));

                for (int j = 1 ; j < count; j++)
                    System.out.print(" + " + arr.get(j));
                System.out.println();
            }

            else
                System.out.println(n + " is NOT perfect.");

        }
    }
}
