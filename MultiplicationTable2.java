public class MultiplicationTable2 {
    public static void main(String[] args) {

        int i, j;
        int num = 9;

        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }

    }
}
