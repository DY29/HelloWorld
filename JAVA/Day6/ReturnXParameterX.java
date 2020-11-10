class Car {
    String name;
    int speed;

    public void printCarInfo(){
        System.out.println("The Name is :"+ name);
        System.out.println("The Speed is :"+speed);
    }
}
public class ReturnXParameterX {
    public static void main (String[] args) {
        Car Yellow = new Car();
        Yellow.name = "Lightning Yellow";
        Yellow.speed = 300;
        Yellow.printCarInfo();
    }
}
