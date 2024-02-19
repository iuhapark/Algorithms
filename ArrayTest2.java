import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) { Scanner sc = new Scanner(System.in);

        System.out.println("1반에서 시험에 응시한 학생 수는 몇 명입니까?");
        int numberOfStudent = sc.nextInt();

        int max = 0;
        String maxName = "0";
        int max2 = 0;    //
        String maxName2 = "0";

        String[] names = new String[numberOfStudent];
        int[] scores = new int[numberOfStudent];

        for (int i = 0; i < names.length; i++) {
            //System.out.println("시험에 응시한 1반 학생의 이름을 입력하세요.");
            //names[i] = sc.next();
            scores[i] = (int) (Math.random() * 100);

            if (scores[i] > max) {
                max = scores[i];
                maxName = names[i];
            }

        }
        System.out.println("2반에서 시험에 응시한 학생 수는 몇 명입니까?");
        int numberOfStudent2 = sc.nextInt();
        String[] names2 = new String[numberOfStudent2];
        int[] scores2 = new int[numberOfStudent2];

        for (int j = 0; j < names2.length; j++) {
            //System.out.println("시험에 응시한 2반 학생의 이름을 입력하세요.");
            //names2[j] = sc.next();
            scores2[j] = (int) (Math.random() * 100);

            if (scores2[j] > max2) {
                max2 = scores2[j];
                maxName2 = names2[j];
            }

        }
        System.out.println("시험에 응시한 1반 학생 수는 " + names.length + "명 이다.");
        System.out.println("1반 1등의 점수는 " + max + "이다.");
        //System.out.println("1반의 1등 학생 이름은 " + maxName + "이다.");

        System.out.println("시험에 응시한 2반 학생 수는 " + names2.length + "명 이다.");
        System.out.println("2반 1등의 점수는 " + max2 + "이다.");
        //System.out.println("2반의 1등 학생 이름은 " + maxName2 + "이다.");
    }
}
