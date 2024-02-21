package TimesTable;

import java.util.Scanner;

public class TimesTable3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j < 5; j++) {
                    System.out.printf("%3d * %d = %3d ",(j+1) ,i ,((j+1)*i));
                }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            for (int j = 5; j < 9; j++) {
                System.out.printf("%3d * %d = %3d ",(j+1) ,i ,((j+1)*i));
            }
            System.out.println();
        }
            int number = sc.nextInt();
        }

    }
