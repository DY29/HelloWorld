// 비트연산자: 메모리 열악한 환경에서 사용. 일반 PC 환경에서는 잘 사용하지 않음
public class BitOpTest {
    public static void main(String arg[]){
        int a = 2;
        int b =5;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int i, j;
        i = a << 2;
        j = b >> 2;

        System.out.println("a = "+ a);
        System.out.println("b = " +b);
        System.out.println("a | b = " + c);
        System.out.println("a & b = " + d);
        System.out.println("a ^ b = " + e);
        System.out.println("a << 2 = " + i);
        System.out.println("b >> 2 = "+ j);
    }
}
