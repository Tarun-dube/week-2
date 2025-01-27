package VehicleRentalsystem;

public class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.2;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance: 20% of rental rate.";
    }
}
