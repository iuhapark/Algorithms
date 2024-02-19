import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("2부터 9까지 정수 값을 입력하세요.: ");
            int number = sc.nextInt();
            for (int i = 1; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + number * i);
            }
        }
    }