import java.util.Scanner;

public class ArrayTest2 {
    /**
     * 최적화 문제 중 최대값 구하기
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("시험에서 1등한 학생의 이름과 점수를 구합니다.");
        int max = 0;    //최댓값 입력 받을 변수 선언
        String maxName=null;    //최댓값일 때 입력 받을 학생 이름 변수 선언

        System.out.println("시험에 응시한 학생 수는 몇명입니까?");
        int numberOfStudent = sc.nextInt(); //입력받을 학생 수 변수 선언
        String[] names = new String[numberOfStudent];
        int[] scores = new int[numberOfStudent];

        for(int i=0;i<names.length;i++){
            System.out.println("응시한 학생의 이름을 입력하세요.");
            names[i]=sc.next();
            System.out.println("점수를 입력하세요.");
            scores[i] = sc.nextInt();

            if(scores[i]>max){
                max = scores[i];
                maxName=names[i];
            }
        }
        System.out.println("시험에 응시한 학생 수는 "+names.length+"명 이다.");

        System.out.println("입력된 값 중 최대값은 "+max+"이다.");
        System.out.println("1등 학생 이름은 "+maxName+"이다.");

    }
}




