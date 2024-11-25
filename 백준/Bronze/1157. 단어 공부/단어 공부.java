import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {

            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z')
                arr[s.charAt(i)-97]++;

            else
                arr[s.charAt(i)-65]++;
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {

            if (arr[i] > max) {
                max = arr[i];
                ch = (char)(i + 65);
            }

            else if (arr[i] == max)
                ch = '?';
        }

        System.out.println(ch);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        String str2;
//        int[] arr = new int[str.length()];
//        String[] sarr = new String[str.length()];
//
//        for (int i = 0; i < str.length(); i++) {
//
//            for (int j = 0; j < str.length(); j++) {
//
//                if (str.charAt(i) > 97)
//                    str2 = String.valueOf((char)(str.charAt(i) - 32));
//                else
//                    str2 = String.valueOf(str.charAt(i));
//
//                if (sarr[j] == null || sarr[j].equals(str2)) {
//                    arr[j]++;
//                    sarr[j] = str2;
//                    break;
//                }
//            }
//        }
//
//        int maxI = 0;
//        String maxS = "";
//        Boolean b = true;
//        for (int i = 0; i < arr.length; i++) {
//
//            if (sarr[i] != null && arr[i] == maxI)
//                b = false;
//
//            else if (sarr[i] != null && arr[i] > maxI) {
//
//                maxI = arr[i];
//                maxS = sarr[i];
//            }
//        }
//
//        System.out.println(b ? maxS : "?");
    }
}