
//지역변수와 전역변수
public class VariableDemo {
    int sum;                             // 전역(global)변수

    public void addScore(int javaScore) { // 지역(local)변수
        int score = javaScore;           // 지역(local)변수
        sum = sum + score;
    }

    public int getSum() {
        return sum;
    }
}
