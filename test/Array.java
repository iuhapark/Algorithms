package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

    public static void main(String[] args) {

        System.out.println("########### Q1 ###########");
        List<Integer> input1 = Arrays.asList(5, 11, 2, 16, 7);
        List<Integer> result1 = Q1(input1);
        System.out.println(result1);

    }

    /**
     * 정수 배열이 주어졌을 때,
     * 이 배열에서 10보다 큰 수만을 포함하는
     * 새 배열을 생성하고 반환하는 함수를 작성하세요.
     */
    public static List<Integer> Q1(List<Integer> input) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) > 10) {
                arr.add(input.get(i));
            }
        }

        return arr;
    }

}
