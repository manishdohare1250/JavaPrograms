public class Driver {
    
    public static void main(String[] args) {
        Car myCar=new Car();///object creation for Car class

        myCar.addFuel(6);// accesing object methods
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.addFuel(3);
        myCar.drive();
        System.out.println( myCar.getCurrentFuelLevel()
        );
    }
}
