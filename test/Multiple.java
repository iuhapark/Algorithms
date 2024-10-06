package test;

import java.util.Scanner;

public class Multiple {

    public static void main(String[] args) {

        System.out.println("########### Q3 ###########");
        System.out.println(Q3(21));

    }

    /**
     * 주어진 숫자가 3의 배수인지 확인하는 함수를 작성하세요.
     */
    public static boolean Q3(int number) {
        return number % 3 == 0;
    }

}
