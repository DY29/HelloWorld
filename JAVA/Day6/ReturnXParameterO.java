class Car{
    String name;
    int speed;

    public void printCarInfo() {
        System.out.println("The name is :" + name);
        System.out.println("The Speed is :"+ speed);
    }
    public void setData(String name, int speed){
        this.name = name;
        this.speed= speed;
    }
}
public class ReturnXParameterO {
    public static void main(String[] args){
        Car Yellow = new Car();
        Yellow.setData("Lightning Yellow", 300);
        Yellow.printCarInfo();
    }
}
