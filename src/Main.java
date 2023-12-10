import com.logistics.garage.builders.RoadTransportBuilder;
import com.logistics.garage.list.fuelType;
import com.logistics.garage.transports.AirTransport;
import com.logistics.garage.transports.LandTransport;
import com.logistics.garage.transports.WaterTransport;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Create a class object Transport
//        var wat = new Transport() {
//            @Override
//            public void start() {
//            }
//        };

        // Create a class object com.logistics.garage.type.AirTransport
        var plane = new AirTransport("plane", "boeing", 1996, 2055.50, true, "Victory", "AUI", 217, 2, true);
        System.out.println("***com.logistics.garage.type.AirTransport");
        System.out.println("Type: " + plane.getType());
        System.out.println("Brand: " + plane.getBrand());
        System.out.println("Year of creation: " + plane.getYear());
        System.out.println("Price: " + plane.getPrice() + "$");
        System.out.println("Available now: " + plane.isAvailable());
        System.out.println("Name: " + plane.getName());
        System.out.println("Airline: " + plane.getAirline());
        System.out.println("Passenger capacity: " + plane.getPassengerCapacity());
        System.out.println("Fuel tank capacity: " + plane.getFuelCapacity());
        System.out.println("Commercial: " + plane.isCommercial());
        plane.start();
        plane.drive();
        plane.stop();

        var vessel = new WaterTransport("ship", "Harland and Wolff", 1912, 7500000, false, "Titanic", 52310, 2439, true, 1912);
        System.out.println(" "); //
        System.out.println("***com.logistics.garage.type.WaterTransport");
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
        vessel.start();

        // com.logistics.garage.builders.RoadTransportBuilder
        var bus = new LandTransport("bus", "Mercedes", 2001, 1500000, true, "London", "FlixBus", 54, false, 2032);
        var buss = new RoadTransportBuilder()
                .setType("Bus")
                .setBrand("Mercedes")
                .setYear(2001)
                .setPrice(1500000)
                .setIsAvailable(true)
                .setName("London")
                .setCompany("FlixBus")
                .setSeatingCapacity(54)
                .setIsDoubleDecker(false)
                .setYearEnding(2032)
                .setNumOfDoors(5)
                .setColor("grey")
                .setIsAutomatic(true)
                .setMileage(216)
                .setFuelType(fuelType.diesel)
                .createRoadTransport();
        System.out.println(buss.toString());
        buss.start(); // abstract class
        buss.drive(); // interface
        buss.stop(); // interface

        var microbus = new RoadTransportBuilder() // Это попытка посмотреть, что будет, если не все заполнить, это для меня.
                .setType("micro")
                .setBrand("Benz")
                .setYear(2020)
                .setFuelType(fuelType.naturalGas)
                .createRoadTransport();
        System.out.println(" ");
        System.out.println(microbus.toString());

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