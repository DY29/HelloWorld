public class WhileTest {
    public static void main(String args[]){
        int i = 1;
        int sum = 0;
        while(i<=100){
            if ((i%2)==0){
                sum = sum+i;
            }
            ++i;
        }
        System.out.println("1~100  사이 짝수의 합:"+sum);
    }
}
