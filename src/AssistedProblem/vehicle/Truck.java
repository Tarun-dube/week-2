package AssistedProblem.vehicle;

public class Truck extends Vehicle {
    String color;
    public Truck(int speed, String fuelType,String color) {
        super(speed, fuelType);
        this.color = color;

    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Color: " + color);
    }

}
