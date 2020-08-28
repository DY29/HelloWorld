/*명시적 형변환: 더 작은 범위를 나타내는 데이터 타입으로 변환되는 경우(축소 형변환)
데이터 타입이 축소되어 변환된 후에도 해당 값을 표현할 수 있어야함
*/

public class DemotionTest {

    public static void main(String args[]) {
        byte b1 = 127;
        char c1 = '가';
        int i1;
        double d1;
        System.out.println("자동 형변환의 결과");
        i1 = b1;    // int데이터를 byte형으로 명시적 형변환한 경우로, byte는 128을 표현할 수 없으므로 전혀 다른값, -128이 b1에 저장됨

        System.out.println("i1 = b1의 형변환" + i1);
        i1 = c1;    // 97이라는 int데이터를 char형으로 명시적 형변환한 경우로, 97을 유니코드로 하는 문자인 소문자 a가 c1에 저장됨

        System.out.println("i1 = c1의 형변환"+ i1);
        d1 = i1;    // int double데이터를 int데이터로 명시적 형변환하여 3.14의 소수점 아래를 제외한 정수부분만을 i1변수에 저장함

        System.out.println("d1 = i1의 형변환" + d1);
    }
}
