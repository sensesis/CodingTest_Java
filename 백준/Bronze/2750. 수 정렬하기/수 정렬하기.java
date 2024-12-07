import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++)
            arr.add(Integer.parseInt(br.readLine()));

        Collections.sort(arr);

        for (int num : arr)
            System.out.println(num);

//        HashSet<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < n; i++)
//            set.add(Integer.parseInt(br.readLine()));
//
//        int[] arr = set.stream()
//                       .sorted()
//                       .mapToInt(Integer::intValue)
//                       .toArray();

    }
}
