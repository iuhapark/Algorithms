package Static;

public class Data {
    public String name;

    public Data(String name, DataCounter counter) {
        this.name = name;
        counter.count++;
    }
}
