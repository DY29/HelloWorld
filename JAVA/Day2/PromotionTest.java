/*묵시적 형 변환: 형변환 연산자를 사용하지 않아도 자동으로 형변환이 이루어지는 경우
규칙: byte -> shor -> int -> long -> float -> double / char -> int -> long -> float -> double
 */
public class PromotionTest {
    public static void main(String args[]) {
        byte b1 = 127;
        char c1 = '가';
        int i1;
        double d1;
        System.out.println("자동 형변환의 결과");
        i1 = b1;        // byte를 int형으로 형변환하는 경우로써, 127이라는 값이 1byte에서 4byte로 표현된

        System.out.println("i1 = b1의 형변환" + i1);
        i1 = c1;        // char의 '가'를 int형으로 형변환하면, '가'를 유니코드로 표현한 십진수의 값(44032)이 int데이터인 i1에 저장됨

        System.out.println("i1 = c1의 형변환"+ i1);
        d1 = i1;        // int데이터를 doubel로 형변환하면 정수가 실수로 변환되어, i1에 저장되었던 44032라는 값이 44032.0의 8바이트 실수로 전환되어 저장됨

        System.out.println("d1 = i1의 형변환" + d1);
    }
}
