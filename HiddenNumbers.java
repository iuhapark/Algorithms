public class HiddenNumbers {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("aAb1B2cC34oOp"));

    }
    /* 문자열 my_string이 매개변수로 주어집니다.
    my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
     */
    public static int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split("[^0-9]"); //    [^0-9] : 숫자가 아닌 문자 다른 방법으로 표현하자면 [^\\d]
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) {
                answer += Integer.parseInt(str[i]);
            }
        }

        return answer;
    }
}
