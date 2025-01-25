package AssistedProblem.vehicle;

public class Car extends Vehicle {
    String color;
   public Car(int speed, String fuelType, String color) {

       super(speed, fuelType);
       this.color = color;
   }
   public void displayDetails(){
       super.displayDetails();
       System.out.println("Color: " + color);
   }
}
