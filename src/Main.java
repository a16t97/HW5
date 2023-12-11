import com.logistics.garage.builders.RoadTransportBuilder;
import com.logistics.garage.list.fuelType;
import com.logistics.garage.transports.AirTransport;
import com.logistics.garage.transports.LandTransport;
import com.logistics.garage.transports.UndergroundTransport;
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

        // Create a class object AirTransport
        var plane = new AirTransport("plane", "boeing", 1996, 2055.50, true, "Victory", "AUI", 217, 2, true);
        System.out.println(plane); // the first way StringBuilder
        plane.start();
        plane.drive();
        plane.stop();

        // Create a class object WaterTransport
        var vessel = new WaterTransport("ship", "Harland and Wolff", 1912, 7500000, false, "Titanic", 52310, 2439, true, 1912);
        System.out.println(" ");
        System.out.println(vessel); // the second way StringBuffer
        vessel.start();

        // RoadTransportBuilder
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
        System.out.println(" "); // чтоб был отсуп в выводе
        System.out.println(buss); // the third way (String concat(+) and super.toString())
        buss.start(); // abstract class
        buss.drive(); // interface
        buss.stop(); // interface

        // Create a class object UndergroundTransport
        var subway = new UndergroundTransport("subway","Intersity", 2007, 2000000, true, "ItaliaRail", 562, 9, "red", 7);
        System.out.println(" "); // для отступа
        System.out.println(subway); // the 4th way StringJoiner
        subway.start(); // abstract class
        subway.drive(); // interface
        subway.stop(); // interface

       // Create a class object LandTransport
        var bus = new LandTransport("bus", "Mercedes", 2001, 1500000, true, "London", "FlixBus", 54, false, 2032);
        System.out.println(" "); // для отступа
        System.out.println(bus); // the 5th way (String concat(+))

//        var microbus = new RoadTransportBuilder() // Это попытка посмотреть, что будет, если не все заполнить, это для меня.
//                .setType("micro")
//                .setBrand("Benz")
//                .setYear(2020)
//                .setFuelType(fuelType.naturalGas)
//                .createRoadTransport();
//        System.out.println(" ");
//        System.out.println(microbus.toString());

//        System.out.println("Type of transport: " + bus.getType());
//        System.out.println("Brand: " + bus.getBrand());
//        System.out.println("Name: " + bus.getName());
//        System.out.println("Price: " + bus.getPrice() + "$");
//        System.out.println("Year of creation: " + bus.getYear());
//        System.out.println("Available now: " + bus.isAvailable());
//        System.out.println("Company: " + bus.getCompany());
//        System.out.println("Passenger capacity: " + bus.getSeatingCapacity());
//        System.out.println("Double Decker: " + bus.isDoubleDecker());
//        System.out.println("Year of decommissioning: " + bus.getYearEnding());
//        System.out.println("Number of doors: " + buss.getNumOfDoors());
//        System.out.println("Color: " + buss.getColor());
//        System.out.println("Automatic transmission: " + buss.isAutomatic());
//        System.out.println("Mileage: " + buss.getMileage() + " mil");
//        System.out.println("Type of fuel: " + buss.getFuelType());
    }
}