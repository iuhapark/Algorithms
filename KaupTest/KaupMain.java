package KaupTest;

public class KaupMain {
    // 카우프지수 구하는 프로그램을 작성해 주세요.


    public static void main(String[] args) {
        double randomHeight = (Math.random() * 49) + 150;
        double randomWeight = (Math.random() * 69) + 30;

        System.out.printf("랜덤 키: %f", randomHeight);
        System.out.println("");
        System.out.printf("랜덤 체중: %f", randomWeight);
        System.out.println("");

        double result = randomWeight / ((randomHeight / 100) * (randomHeight / 100));
        System.out.println("체질량 지수: " + result);
    }
}
