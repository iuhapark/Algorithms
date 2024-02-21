package gradeOOP;

public class Student {
    private String name;
    private double koreanScore;
    private double englishScore;
    private double mathScore;
    private double avg;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setKoreanScore(double koreanScore) {
        this.koreanScore = koreanScore;
    }

    public double getKoreanScore() {
        return this.koreanScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public double getEnglishScore() {
        return this.englishScore;
    }
    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }
    public double getMathScore() {
        return this.mathScore;
    }
    public double getAvg() {
        return this.avg;

        }
    public void createAVG() {
        this.avg = koreanScore+englishScore+mathScore;
    }
}
