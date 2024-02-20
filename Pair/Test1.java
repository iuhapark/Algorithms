package Pair;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] height = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            System.out.println("키를 입력하세요.");
            height[i] = sc.nextInt();
            sum += height[i];
        }
            Arrays.sort(height);
            int a = 0;
            int b = 0;

            for (int i = 0; i < 8; i++) {
                for (int j = i + 1; j < 9; j++) {
                    if (sum - height[i] - height[j] == 100) {
                        a = height[i];
                        b = height[j];
                        break;
                    }
                }
            }
        for(int i = 0; i<9; i++) {
            if(i == a || i == b)
                continue;
            System.out.println(height[i]);
        }
        sc.close();
    }
}