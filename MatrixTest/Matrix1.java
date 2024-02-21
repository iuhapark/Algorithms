package MatrixTest;

public class Matrix1 {
    public static void main(String[] args) {
        int[][] mtx = new int[5][5]; //5x5 크기의 2차원 배열 mtx 선언
        int k = 1;


        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                mtx[i][j] = k;
                System.out.print(mtx[i][j] + " ");
                k++;
            }
            System.out.println();
        }
    }
}