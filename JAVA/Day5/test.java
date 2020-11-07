public class test {
    public static void main(String[] args){
        // 운전자 객체 생성
        Driver kim = new Driver();
        kim.name = "성나정";

        System.out.println(kim.name + "이 운전합니다.");
        kim.driving();
    }
}
