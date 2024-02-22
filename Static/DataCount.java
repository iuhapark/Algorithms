package Static;

public class DataCount {

    public static void main(String[] args) {

        DataCounter counter = new DataCounter();

        Data data1 = new Data("A", counter);
        System.out.println("A count = " + counter.count);

        Data data2 = new Data("B", counter);
        System.out.println("B count = " + counter.count);

        Data data3 = new Data("C", counter);
        System.out.println("C count = " + counter.count);


    }
}
