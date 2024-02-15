import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("ID를 입력해 주세요.");
        String ID = sc.next();
        System.out.println("비밀번호를 입력해 주세요.");
        String pw = sc.next();
        System.out.println("비밀번호를 한 번 더 입력해 주세요.");
        String pwAgain = sc.next();
        System.out.println("이름를 입력해 주세요.");
        String name = sc.next();
        System.out.println("주민번호를 입력해 주세요.");
        String number = sc.next();
        System.out.println("전화번호를 입력해 주세요.");
        String phoneNumber = sc.next();
        System.out.println("주소를 입력해 주세요.");
        String address = sc.next();
        System.out.println("직업를 입력해 주세요.");
        String job = sc.next();
        System.out.println("ID: "+ID);
        System.out.println("비 번: "+pw);
        System.out.println("비번확인: "+pwAgain);
        System.out.println("이 름: "+name);
        System.out.println("주민번호: "+number);
        System.out.println("전화번호: "+phoneNumber);
        System.out.println("주 소: "+address);
        System.out.println("직업: "+job);
    }
}
