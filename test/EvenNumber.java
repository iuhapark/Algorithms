package test;

public class EvenNumber {

    public static void main(String[] args) {

        System.out.println("########### Q2 ###########");
        System.out.println(Q2());

    }

    /**
     * 1부터 100까지의 숫자 중에서 짝수만을 합산하는 함수를 작성하세요.
     */
    public static int Q2() {
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                num += i;
            }
        }
        return num;
    }

    ;

};
