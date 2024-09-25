public class Median {
    public static void main(String[] args) {
        int n = 5;
        int t = 3;
        System.out.println(solution(new int[]{1, 2, 7, 10, 11}));

    }
    /* 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
    예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때,
    중앙값을 return 하도록 solution 함수를 완성해보세요.
     */
    public static int solution(int[] array) {
        int answer = 0;
        int n = array.length;
        int[] sortedArray = new int[n];
        for (int i = 0; i < n; i++) {
            sortedArray[i] = array[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (sortedArray[i] > sortedArray[j]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        if (n % 2 == 0) {
            answer = sortedArray[n / 2 - 1];
        } else {
            answer = sortedArray[n / 2];
        }
        return answer;
    }
}
