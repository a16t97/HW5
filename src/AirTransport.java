public class AirTransport extends Transport implements Drivable{
    private String name;
    private String airline;
    private int passengerCapacity;
    private double fuelCapacity;
    private boolean isCommercial;
    @Override
    public void start() {
        System.out.println("Light turned on");
    }
    public void drive(){
        System.out.println("Start to take off");
    }
    public void stop(){
        System.out.println("Lands");
    }

    public AirTransport(String type, String brand, int year, double price, boolean isAvailable, String name, String airline, int passengerCapacity, double fuelCapacity, boolean isCommercial) {
        super(type, brand, year, price, isAvailable);
        this.name = name;
        this.airline = airline;
        this.passengerCapacity = passengerCapacity;
        this.fuelCapacity = fuelCapacity;
        this.isCommercial = isCommercial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public boolean isCommercial() {
        return isCommercial;
    }

    public void setCommercial(boolean commercial) {
        isCommercial = commercial;
    }
}