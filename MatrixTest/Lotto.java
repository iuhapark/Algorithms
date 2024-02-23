package MatrixTest;

import java.util.Random;

public class Lotto {
    public static void main(String[] args) {

        int[] lottoNum = new int[6];

        // 크기가 6인 로또 배열에 1 ~ 45 랜덤 숫자 넣기
        for (int i = 0; i < lottoNum.length; i++) {
            lottoNum[i] = (int) (Math.random() * 45) + 1;
        }

        // 중복 제거
        for (int i = 0; i < lottoNum.length; i++) {
            for (int j = 0; j < i; j++) {
                if (lottoNum[i] == lottoNum[j]) {
                    i--;
                }
            }
        }

        // 버블 정렬
        for (int i = 0; i < lottoNum.length; i++) {
            for (int j = 0; j < lottoNum.length - 1; j++) { //비교 대상이 점점 줄어듬
                if (lottoNum[j] > lottoNum[j + 1]) {
                    int temp = lottoNum[j];
                    lottoNum[j] = lottoNum[j + 1];
                    lottoNum[j + 1] = temp;
                }
            }
        }

        // 로또 출력
        System.out.print("로또 번호 : ");
        for (int i = 0; i < lottoNum.length; i++) {
            System.out.print(lottoNum[i] + " ");
        }
    }
}









