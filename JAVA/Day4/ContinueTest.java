public class ContinueTest {
    public static void main(String args[]){
        int [] scoreList = {98, 57, 49, 100, 99, 85, 77};
        int scoreSum = 0;
        for (int i = 0; i< scoreList.length; i++){
            if((scoreList[i] % 2)!=0){
                continue;
            }
            scoreSum = scoreSum + scoreList[i];
        }
        System.out.println("scoreSum = "+ scoreSum);
    }
}
