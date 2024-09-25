import java.util.regex.Matcher;
import java.util.regex.Pattern;

//문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
class Regex {
    public int solution(String my_string) {
        int answer = 0;
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(my_string);
        while (m.find()) {
            answer += Integer.parseInt(m.group());
        }
        return answer;
    }
}