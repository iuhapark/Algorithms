public class OddNumber {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));

    }
    /* 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요. */
    public static int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = 2 * i + 1;
        }
        return answer;
    }
}
