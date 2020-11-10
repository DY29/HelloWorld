public class MethodTest {
    public static void main(String[] args){
        int[] enScore = {55,70,45, 90,100, 90,95};
        int enSum = 0;
        for (int i = 0; i< enScore.length; i++){
            enSum = enSum + enScore[i];
        }
        double enAvgScore = (double)enSum/enScore.length;
        System.out.println("영어평균:" + enAvgScore);

        int[]koScore = {93, 55,87, 80, 100, 95,65};
        int koSum = 0;
        for (int i = 0; i< koScore.length; i++){
            koSum = koSum + koScore[i];
        }
        double koAvgScore = (double)koSum/koScore.length;
        System.out.println("국어평균:"+ koAvgScore);
    }
}
