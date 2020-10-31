public class TwoDArrayTest1 {
    public static void main(String args[]){
        String[][] scoreList = new String[3][4];
        System.out.println("<2차원 배열의 인덱스 출력>");
        for (int i = 0; i < scoreList.length; i++) {
            for (int j = 0; j < scoreList[i].length; j++) {
                scoreList[i][j] = "[" + i + "][" + j + "]요소";
                System.out.print(scoreList[i][j] + "\t");
            }
            System.out.print(" ");
        }
    }
}
