package KaupOOP;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class KaupView {
    static double returnRandomHeight(){
        double randomHeight = (150+Math.random()*50); //0 이상 50 미만의 값을 생성하고 150을 더해줌으로써 키의 범위를 150 이상 200 미만으로 만듦
        randomHeight = Math.floor(randomHeight*10)/10;
        System.out.printf("랜덤 키: %.1f", randomHeight);
        return randomHeight;
    }
    static double returnRandomWeight() {
        double randomWeight = (30+Math.random()*70); //0 이상 70 미만의 값을 생성하고 30을 더해줌으로써 체중의 범위를 30 이상 100 미만으로 만듦
        randomWeight = Math.floor(randomWeight*10)/10;
        System.out.printf("랜덤 체중: %.1f", randomWeight);
        return randomWeight;
    }
    public static void main(String[] args) {

        Person person = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.printf("이름: ");
        person.setName(sc.next());
        person.setHeight(returnRandomHeight()); //set은 접두사로 사용
        person.setWeight(returnRandomWeight());
        person.createBMI();
        person.createBodyMass();

        System.out.println("BMI 계산기");
        System.out.println("이름: "+person.getName());
        System.out.println("키: "+person.getHeight());
        System.out.println("몸무게: "+person.getWeight());
        System.out.printf("BMI는"+person.getBmi()+"입니다.",person.getBmi());
        System.out.printf("당신은 "+person.getBodyMass()+"입니다.");
    }
}