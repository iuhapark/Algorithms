import java.util.Scanner;

public class Calcualtor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자: ");
        String num1 = sc.next();
        System.out.println("두번째 숫자: ");
        String num2 = sc.next();
        System.out.println("첫번째 숫자: " + num1);
        System.out.println("두번째 숫자: " + num2);
        System.out.println("+, -, *. /을 입력하세요.");
        String opcode = sc.next();
        int result = 0;
        int intNum1 = Integer.parseInt(num1);
        int intNum2 = Integer.parseInt(num2);

        if (opcode.equals("+")) {
            result = intNum1 + intNum2;
        } else if (opcode.equals("-")) {
            result = intNum1 - intNum2;
        } else if (opcode.equals("*")) {
            result = intNum1 * intNum2;
        } else if (opcode.equals("/")) {
            result = intNum1 / intNum2;
        } else {
            System.out.println("잘못된 연산기호입니다.");
        }

        switch (opcode){
        case "+": result = intNum1 + intNum2; break;  //만약 여기서 break 가 없으면 +임에도 -로 계산됨. 에러는 뜨지 않음.
        case "-": result = intNum1 - intNum2; break;
        case "*": result = intNum1 * intNum2; break;
        case "/": result = intNum1 / intNum2; break;
            default:
                System.out.println("잘못된 연산자");
        }

        System.out.println("첫번째 숫자: " + num1);
        System.out.println("두번째 숫자: " + num2);
        System.out.println("연산결과: " + result);
    }
}