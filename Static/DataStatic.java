package Static;

public class DataStatic {

    public String name;
    public static int count; // static이 붙은 정적 변수(클래스 변수)는 클래스에 접근 가능함. 즉 클래스 자체에 소속되어 있음.

    public DataStatic(String name) {
        this.name = name;
        DataStatic.count++; // 객체가 생성될 때마다 클래스 변수 count가 1씩 증가하는 기능. 즉 count 클래스 변수 공유 가능함.
    }
}
