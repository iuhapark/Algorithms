public class Dice {
    public static void main(String[] args) {
        int[] box = {1, 1, 1};
        int n = 1;
        System.out.println(solution(box, n));
    }
    /* 주사위의 개수
    머쓱이는 직육면체 모양의 상자를 하나 가지고 있는데 이 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다.
    상자의 가로, 세로, 높이가 저장되어있는 배열 box와 주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때,
    상자에 들어갈 수 있는 주사위의 최대 개수를 return 하도록 solution 함수를 완성해주세요. */
    public static int solution(int[] box, int n) {
        int answer = 0;
        int[] boxSort = new int[3];
        for (int i = 0; i < box.length; i++) {
            boxSort[i] = box[i];
        }
        for (int i = 0; i < boxSort.length; i++) {
            for (int j = i + 1; j < boxSort.length; j++) {
                if (boxSort[i] < boxSort[j]) {
                    int temp = boxSort[i];
                    boxSort[i] = boxSort[j];
                    boxSort[j] = temp;
                }
            }
        }
        answer = (boxSort[0] / n) * (boxSort[1] / n) * (boxSort[2] / n);
        return answer;
    }

}
