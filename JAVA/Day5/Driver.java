public class Driver {
    String name;
     void driving() {
         Car myCar = new Car();
         myCar.name = "Red";
         myCar.currentGear = 0;
         myCar.currentSpeed = 0;

         myCar.startEngine();
         System.out.println(myCar.getCurrentState());
         myCar.changeGear(2);
         System.out.println(myCar.getCurrentState());
         myCar.changeGear(3);
         System.out.println(myCar.getCurrentState());
         myCar.stopEngine();
         System.out.println(myCar.getCurrentState());

     }
}
