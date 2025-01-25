package AssistedProblem.vehicle;

public class Motorcycle extends Vehicle {
    String color;
    public Motorcycle(int speed, String fuelType, String color) {
        super(speed, fuelType);
        this.color = color;
    }
   public void displayDetails(){
        super.displayDetails();
        System.out.println("Color: " + color);
   }
}
