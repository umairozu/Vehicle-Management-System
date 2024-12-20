
public class Vehicle {
    private String make;
    private int year;
    private double rentalPerDay;
    private String model;
    private boolean onRent;
    RentalSystem vehicle;
    public boolean isOnRent() {
        return onRent;
    }
    public String getMake() {
        return make;
    }
    public double getRentalPerDay() {
        return rentalPerDay;
    }
    public String getModel() {
        return model;
    }
    public Vehicle() {
    }
    public Vehicle(String make, String model, double rentalPerDay) {
        this.make = make;
        this.model = model;
        this.rentalPerDay = rentalPerDay;
    }
    public Vehicle(String make, String model, double rentalPerDay, boolean onRent) {
        this.make = make;
        this.model = model;
        this.rentalPerDay = rentalPerDay;
        this.onRent = onRent;
    }
}
