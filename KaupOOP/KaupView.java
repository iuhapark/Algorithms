package KaupOOP;

public class KaupView {
    static double returnRandomTall(){
        double randomTall = (150+Math.random()*50); //0 이상 50 미만의 값을 생성하고 150을 더해줌으로써 키의 범위를 150 이상 200 미만으로 만듦
        randomTall = Math.floor(randomTall*10)/10;
        System.out.printf("랜덤값 : %.1f", randomTall);
        return randomTall;
    }
    static double returnRandomWeight() {
        double randomWeight = (30+Math.random()*70); //0 이상 70 미만의 값을 생성하고 30을 더해줌으로써 체중의 범위를 30 이상 100 미만으로 만듦
        randomWeight = Math.floor(randomWeight*10)/10;
        System.out.printf("랜덤값2 : %.1f", randomWeight);
        return randomWeight;
    }
    public static void main(String[] args) {

        double randomTall = returnRandomTall();
        double randomWeight = returnRandomWeight();
        System.out.println("키"+randomTall);
        System.out.println("몸무게"+randomWeight);
        double bmi = randomWeight / Math.pow(randomTall/100,2);
        System.out.printf("BMI는 %.1f 입니다", bmi);
    }
}