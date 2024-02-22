package Static;

public class DataStaticCount {
    public static void main(String[] args) {

        DataStatic data1 = new DataStatic("A");
        System.out.println("A count = " + DataStatic.count); // static이 붙은 정적 변수는 클래스에 접근 가능함.

        DataStatic data2 = new DataStatic("B");
        System.out.println("B count = " + DataStatic.count);

        DataStatic data3 = new DataStatic("C");
        System.out.println("C count = " + DataStatic.count);

        // 인스턴스를 통한 접근, 인스턴스 변수로 오해할 수 있기 때문에 추천하지 않음.
        DataStatic data4 = new DataStatic("D");
        System.out.println("D count = " + data4.count);
        // 클래스를 통한 접근
        System.out.println("D count = " + DataStatic.count);

    }
}
