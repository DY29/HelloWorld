public class PrimitiveTypeTest {
    public static void main(String args[]) {
        //int num = 2124125; -> int형의 표현 범위를 초과한 값을 가질 경우 컴파일 오류 발생

        int num1 = 32141;
        int num2 = 1;

        int num3 = num1 + num2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
