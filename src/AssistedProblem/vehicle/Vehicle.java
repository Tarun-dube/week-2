package AssistedProblem.vehicle;

public class Vehicle {
    int speed;
    String fuelType;

    Vehicle(int speed, String fuelType) {
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public void displayDetails(){
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
    }
}
