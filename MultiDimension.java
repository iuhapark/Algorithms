import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("다음 시험에서 두 반의 평균 점수를 구하시오.");

        System.out.println("1반에서 시험에 응시한 학생 수는 몇 명입니까?");
        int numberOfStudent = sc.nextInt();
        System.out.println("2반에서 시험에 응시한 학생 수는 몇 입니까?");
        int numberOfStudent2 = sc.nextInt();

        int[] scores = new int[numberOfStudent];
        int[] scores2 = new int[numberOfStudent2];

        int avg = 0;
        int avg2 = 0;

        for(int i=0;i<scores.length;i++) {
            System.out.println("1반 학생의 점수 입력: ");
            scores[i] = sc.nextInt();
            avg += scores[i];
        }

        for(int j=0;j<scores2.length;j++) {
            System.out.println("2반 학생의 점수 입력.: ");
            scores[j] = sc.nextInt();
            avg2 += scores[j];
        }

        System.out.println("1반의 평균 점수는 "+avg/numberOfStudent+"이다.");
        System.out.println("2반의 평균 점수는 "+avg2/numberOfStudent2+"이다.");
    }
}
