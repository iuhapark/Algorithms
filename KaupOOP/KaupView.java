package KaupOOP;

import MemberOOP.Member;

import java.util.Scanner;

public class KaupView { static String test;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Member person = new Member(Math.floor((150 + Math.random() * 50) * 10) / 10
                , Math.floor((30 + Math.random() * 70) * 10) / 10);

        KaupService service = new KaupServiceImpl();

        double bmi = service.createBmi();
        String bodyMass = service.createBodyMass();

        System.out.println("================= BMI 계산기 =================");
        System.out.println("이름: " + person.getName());
        System.out.println("키: " + person.getHeight());
        System.out.println("몸무게: " + person.getWeight());
        System.out.printf("BMI는 %.1f 입니다\n", bmi);
        System.out.println(bodyMass + "입니다.");
        System.out.println("================= BMI 계산기 =================");
    }
    }