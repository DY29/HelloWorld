public class BreakTest {
    public static void main(String args[]){
        int [] scoreList = {98, 57, 49, 100, 99, 85, 77};
        int maxScore = 300;
        int scoreSum = 0;
        for (int i = 0; i< scoreList.length; i++){
            scoreSum = scoreSum + scoreList[i];
            if(scoreSum > maxScore){
                scoreSum = scoreSum - scoreList[i];
                break;
            }
        }
        System.out.println("scoreSum = "+ scoreSum);
    }
}
