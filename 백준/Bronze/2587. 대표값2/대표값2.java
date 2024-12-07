import java.io.*;
import java.util.*;
/*
sort 후 평균값 + (n.size() / 2) + 1의 값 출력(중앙값)
*/
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        System.out.println(sum/5);
        System.out.println(arr[((5/2)+1)-1]);
    }
}
