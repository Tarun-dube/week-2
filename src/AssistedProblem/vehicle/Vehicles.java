package AssistedProblem.vehicle;

public class Vehicles {
    public static void main(String[] args) {
        //car details
        Car car=new Car(250,"petrol","black");
        car.displayDetails();

        //truck details
        Truck truck=new Truck(150,"disel","brown");
        truck.displayDetails();

        //motorcycle details
        Motorcycle motorcycle=new Motorcycle(200,"petrol","red");
        motorcycle.displayDetails();
    }
}

