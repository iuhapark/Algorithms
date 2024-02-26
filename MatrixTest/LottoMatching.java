package MatrixTest;

import java.util.Random;
import java.util.Scanner;

/**
 * 로또 발급은 1~6까지 중복없는 숫자 6개이다. 하나는 구매한 로또이다.
 * 추가된 로직은 추첨된 로또이다.
 * 두 로또의 일치 여부에 따라
 * 다음과 같은 메시지를 출력한다.
 * 단 구매로또 번호와 추첨로또 번호 모두 같이 출력한다.
 * <p>
 * 1등 6개 맞춤
 * 2등 5개 맞춤
 * 3등 4개 맞춤
 * 4등 3개 맞춤
 * 꽝 2개 이하
 */
public class LottoMatching {
    public static void main(String[] args) {
        int[] arr = new int[6];
        // 중복되지 않은 상태
        // arr = createArrayWithoutDuplicates(arr);
        // 오름차순 정렬
        // arr = sortAscending(arr);
        // 출력
        // printLotto(arr);
    }

    //6개의 숫자 로또 프린트


}

class BuyLotto {
    public static void main(String[] args) {
        buyLotto();
    }
    public static void buyLotto(){
        Scanner sc = new Scanner(System.in);
        int[] lottoNum = new int[6];
        for(int i=0;i<lottoNum.length;i++){
            System.out.println("로또 번호를 입력하세요.");
            int num = sc.nextInt();
            lottoNum[i] = num;
        }
        System.out.print("입력한 로또 번호: ");
        for (int i = 0; i < lottoNum.length; i++) {
            System.out.print(lottoNum[i] + " ");
            }
    }
}


class LottoDraw {
    public static void main(String[] args) {
        lottoDraw();
    }
    public static void lottoDraw(){
        Scanner sc = new Scanner(System.in);
    }


    private static void printLotto(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d \t", arr[i]);
        }
    }

    private static int[] sortAscending(int[] arr) {
        // 버블 정렬이 들어갈 부분
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] createArrayWithoutDuplicates(int[] arr) {
        for (int i = 0; i < 6; i++) {
            int randomNumber = createRandomNumber(1, 45);
            boolean check = false;
            for (int j = 0; j < 6; j++) {
                if (arr[j] == randomNumber) {
                    // 중복되면  check 를 true 로 바꿔라..
                    check = true;
                }
            }
            if (check == false) {
                arr[i] = randomNumber; // 중복되지 않았으니 배열에 담아라.
            } else {
                i--; // 중복됐으면 이번 회수는 무효로 하고 다시 뽑아라.
            }

        }
        return arr;
    }

    private static int createRandomNumber(int start, int end) {
        Random random = new Random();
        return random.nextInt(end) + start;
    }
}
