import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        RentalSystem vehicle = new RentalSystem();
        vehicle.addVehicle(new Car("Toyota", "Prius", 200, false));
        vehicle.addVehicle(new Car("Toyota", "Camry", 300, false));
        vehicle.addVehicle(new Car("Honda", "Civic", 500, true));
        vehicle.addVehicle(new Truck("Ford", "truck", 200, false));
        vehicle.addVehicle(new MotorCycle("Yamaha","R3",100,true));

        Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Enter the Vehicle's make: ");
                String make = scanner.nextLine();
                if (make.equals("")) {
                    System.out.println("Requested fields are empty!");
                    break;
                }
                System.out.println("Enter number of rental days:");
                int days = Integer.parseInt(scanner.nextLine());
                vehicle.isAvailable(make);
                System.out.println("--------------");
                for (Vehicle v: vehicle.getVehicles()){
                    if (v.getMake().equals(make)&&!v.isOnRent()){
                        vehicle.searchVehiclesByBrand(make);
                        break;
                    }
                }
                System.out.println("--------------");
                vehicle.calculateRentalCost(days,make);
            }
            scanner.close();
    }
}
