public class TaxiTest {
    public static void main(String[] args) {
        // Taxi 객체(Instance)생성
        Taxi myTaxi = new Taxi();
        // 초기값 설정
        myTaxi.name = "대현운수 308";
        myTaxi.currentGear = 2;
        myTaxi.fare = 3400;
        myTaxi.passengerYn = true;
        System.out.println(myTaxi.getCurrentState());
    }
}
