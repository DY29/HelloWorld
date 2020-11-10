class Car {
    // serialNumber은 중요한 데이터이기 때문에 private 으로 접근을 제한
    private int serialNumber;
    protected String name;
    // 단순히 name과 speed 변수만 멤버로 가지고 있는 Car 클래스를 선언함
    int speed;

    //getSerialNumber()메서드는 public으로 정의되어 있지만, 인증된  managerId에 대해서만 serialNumber정보를 리턴하고,
    // 인증되지 않은 managerid에 대해서는 0을 리턴함
    public int getSerialNumber(int managerId){
        if (managerId == 12345) {
            return serialNumber;
        }
        return 0;
    }
    // setSerialNumber() 메서드는 어디에서든 호출하여 serialNumber값을 설정할 수 있도록 public으로 정의함
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

}

public class CarTest{
    public static void main(String[] args){
        // Car 유형의 Yellow 변수를 선언하고, Car 클래스로부터 객체를 생성하여
        // 주소값을 할당함
        Car Yellow = new Car();

        // 생성된 Yellow 객체에 이름과 속도를 적절한 값으로 설정함
        Yellow.name = "Lightning Yellow";
        Yellow.speed = 300;
        Yellow.setSerialNumber(4929);
        //Car 유형의 객체 Yellow를 생성하고 값들을 설정하였고, 
        // SerialNumber변수는 private이기 때문에 setSerialNumber()메서드로 값을 설정함
        System.out.println(Yellow.name + ":" + Yellow.speed);
        System.out.println("Car No:" + Yellow.getSerialNumber(12345));
        //여러 접근권한을 갖는 Car의 멤버변수에 접근함
    }
}

