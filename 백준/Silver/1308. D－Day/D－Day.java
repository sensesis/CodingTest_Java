import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int y2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        // 1000년 이상 차이인지 확인
        if (y2 > y + 1000 || (y2 == y + 1000 && (m2 > m || (m2 == m && d2 >= d)))) {
            System.out.println("gg");
            return;
        }

        // 첫 번째 날짜와 두 번째 날짜까지의 총 일수 계산
        int totalDays1 = calculateDays(y, m, d);
        int totalDays2 = calculateDays(y2, m2, d2);

        // 두 날짜의 일 수 차이 계산
        int sum = 0;
        for (int year = y; year < y2; year++) {
            sum += isLeapYear(year) ? 366 : 365;
        }
        sum += (totalDays2 - totalDays1);

        System.out.println("D-" + sum);
    }

    // 날짜를 연, 월, 일로 변환해 총 일수 계산
    public static int calculateDays(int y, int m, int d) {
        int[] daysInMonth = isLeapYear(y) ?
                new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} :
                new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;
        for (int i = 0; i < m - 1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += d;
        return totalDays;
    }

    // 윤년 여부 확인
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}