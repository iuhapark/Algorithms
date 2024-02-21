package TimesTable;

import java.util.Scanner;

public class TimesTable3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mtx = new int[4][2];

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int result = i * j;
                //mtx[i][j] = result;
                System.out.println(+i + "*" + j + "=" + result);
            }
        }
        int number = sc.nextInt();
    }
}
