public class Car {  //Car class which includes instance variables and instance methods
  
  
  // instance variable of Car class,,, properties,attributes, variables
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;
  


    // instance methods,,  behaviour ,functions
    public void drive(){
        if(currentFuelInLiters==0){
            System.out.println("car is out of fuel");
        }else if(currentFuelInLiters<5){
            System.out.println("car is in reserved mode, please refuel");
            currentFuelInLiters--;
        }else{
            System.out.println("Car is Driving");
            currentFuelInLiters--;
        }
       
    }
    public void addFuel(float fuel){
        currentFuelInLiters+=fuel;
    }
    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}
