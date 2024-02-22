package MatrixTest;

public class Lotto {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            boolean check = false; //중복되지 않은 상태
            for (int j = 0; j < 6; j++) {
                if(arr[i]==0){
                    //중복되면 check 바꿔라.
                }
                if(check==false) {
                    //중복되지 않았으니 배열에 담아라.
                } else {
                    i--;
                    //중복됐으면 이번 회수는 무효로 하고 다시 뽑아라.
                }
            }
        }
        System.out.println();
        //버블 정렬이 들어갈 부분
    }
}