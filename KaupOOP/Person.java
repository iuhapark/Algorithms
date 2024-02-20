package KaupOOP;

import java.util.Scanner;

public class Person {
    private String name;
    private double height;
    private double weight;
    private double bmi;
    private String bodyMass;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHeight(double height) { //value 값; 외부에서 투입된 값 (data 값과는 다름)
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setBmi() {
        this.bmi = bmi;
    }

    public double getBmi() {
        return this.bmi;

    }

    public String getBodyMass() {
        return this.bodyMass;
    }

    public void createBMI() {
        this.bmi = weight / (height * height);

    }

    public void createBodyMass() {

        String bodyMass = "";
        if (bmi < 18.5) {   //this 생략
            bodyMass = "저체중";
        } else if (bmi < 23) {
            bodyMass = "정상 체중";
        } else if (bmi < 25) {
            bodyMass = "과체중";
        } else {
            bodyMass = "비만";
        }
        this.bodyMass = bodyMass;
    }
}

