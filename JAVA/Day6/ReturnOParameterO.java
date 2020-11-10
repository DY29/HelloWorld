class Car{
    String name;
    int speed;

    public String changeCarInfo(String name, int speed){
        this.name = name;
        this.speed = speed;
        return "Change Data: name ="+ name + ","+ "speed = "+ speed;
    }
}
public class ReturnOParameterO {
    public static void main(String[] args){
        Car Yellow = new car();
        Yellow.name = "Lightning Yellow";
        Yellow.speed= 300;
        String returnData = Yellow.changeCarInfo("Mater", 150);
        System.out.println(returnData);
    }
}
