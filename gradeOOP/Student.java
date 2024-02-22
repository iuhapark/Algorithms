package gradeOOP;

public class Student {

    private String name;
    private double korean;
    private double english;
    private double math;
    private double avg;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setKorean(double koreanScore) {
        this.korean = koreanScore;
    }

    public double getKorean() {
        return this.korean;
    }

    public void setEnglish(double englishScore) {
        this.english = englishScore;
    }

    public double getEnglish() {
        return this.english;
    }
    public void setMathScore(double mathScore) {
        this.math = mathScore;
    }
    public double getMathScore() {
        return this.math;
    }
    public double getAvg() {
        return this.avg;

    }
    public void createAVG() {
        this.avg = korean+english+math;
    }
}
