import java.net.SocketImpl;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    // Create a class object Transport
        var wat = new Transport("plane", "boeing", 1996, 2055.50, true);
        System.out.println("***Transport");
        System.out.println("Type: " + wat.getType());
        System.out.println("Brand: " + wat.getBrand());
        System.out.println("Year of creation: " + wat.getYear());
        System.out.println("Price: " + wat.getPrice() + "$");
        System.out.println("Available now: " + wat.isAvailable());

    // Create a class object AirTransport
        var plane = new AirTransport("plane", "boeing", 1996, 2055.50, true, "Victory", "AUI", 217, 2, true);
        System.out.println("***AirTransport");
        System.out.println("Name: " + plane.getName());
        System.out.println("Airline: " + plane.getAirline());
        System.out.println("Passenger capacity: " + plane.getPassengerCapacity());
        System.out.println("Fuel tank capacity: " + plane.getFuelCapacity());
        System.out.println("Commercial: " + plane.isCommercial());

        var vessel = new WaterTransport("ship", "Harland and Wolff", 1912, 7500000, false, "Titanic", 52310, 2439, true, 1912);
        System.out.println("***WaterTransport");
        System.out.println("Type of transport: " + vessel.getType());
        System.out.println("Name: " + vessel.getName());
        System.out.println("Producer: " + vessel.getBrand());
        System.out.println("Year of creation: " + vessel.getYear());
        System.out.println("Weight: " + vessel.getWeight());
        System.out.println("Price: " + vessel.getPrice());
        System.out.println("Available now: " + vessel.isAvailable());
        System.out.println("Passenger capacity: " + vessel.getCapacity());
        System.out.println("Cruise ship: " + vessel.isCruiseShip());
        System.out.println("Year of decommissioning: " + vessel.getYearEnding());

        var bus = new LandTransport("Bus", "Mercedes", 2001, 1500000, true, "London", "FlixBus", 54, false, 2032);
        var buss = new RoadTransport("Bus", "Mercedes", 2001, 1500000, true, "London", "FlixBus", 54, false, 2032, 5, "grey", true, 216, "diesel");
        System.out.println("***Land + RoadTransport");
        System.out.println("Type of transport: " + bus.getType());
        System.out.println("Brand: " + bus.getBrand());
        System.out.println("Name: " + bus.getName());
        System.out.println("Price: " + bus.getPrice() + "$");
        System.out.println("Year of creation: " + bus.getYear());
        System.out.println("Available now: " + bus.isAvailable());
        System.out.println("Company: " + bus.getCompany());
        System.out.println("Passenger capacity: " + bus.getSeatingCapacity());
        System.out.println("Double Decker: " + bus.isDoubleDecker());
        System.out.println("Year of decommissioning: " + bus.getYearEnding());
        System.out.println("Number of doors: " + buss.getNumOfDoors());
        System.out.println("Color: " + buss.getColor());
        System.out.println("Automatic transmission: " + buss.isAutomatic());
        System.out.println("Mileage: " + buss.getMileage() + " mil");
        System.out.println("Type of fuel: " + buss.getFuelType());
}
}