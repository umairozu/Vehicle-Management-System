import java.util.ArrayList;
public class RentalSystem {
    private ArrayList<Vehicle> vehicles;
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
    public RentalSystem(){
        this.vehicles = new ArrayList<>();
    }
    public void addVehicle(Vehicle car) {
        vehicles.add(car);
    }
    public boolean searchVehiclesByBrand(String brand){
        System.out.println("Search result for: "+brand);
        for (Vehicle v : vehicles){
            if (v.getMake().equals(brand) && !v.isOnRent()){
                System.out.println("Vehicle: " +brand+ " " + v.getModel());
            }
        } return false;
    }
    public boolean isAvailable(String make) {
        for (Vehicle v : vehicles) {
            if (v.getMake().equals(make)) {
                if (!v.isOnRent()) {
                    System.out.println(make + " Brand is Available");
                    return true;  // Vehicle is available
                } else {
                    System.out.println(make + " Brand is not Available!");
                    return false;  // Vehicle is not available
                }
            }
        } // If the loop completes without finding a matching make
        System.out.println("Make not found!");
        return false;
    }
    public void calculateRentalCost (int days,String make) {
        for (Vehicle v : vehicles){
            if (v.getMake().equals(make) && !v.isOnRent()){
                double totalRent =  v.getRentalPerDay()* days;
                System.out.println("Rental Fee for "+v.getMake()+""+v.getModel()+": "+ totalRent);
            }
        }
    }
    public interface Rentable {
        public boolean isAvailable(String make);
        public void calculateRentalCost(int days, String make);
    }
}

