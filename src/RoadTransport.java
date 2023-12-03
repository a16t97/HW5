public class RoadTransport extends LandTransport{
    private int numOfDoors;
    private String color;
    private boolean isAutomatic;
    private double mileage;
    private String fuelType;

    public RoadTransport(String type, String brand, int year, double price, boolean isAvailable, String name, String company, int seatingCapacity, boolean isDoubleDecker, int yearCreation, int numOfDoors, String color, boolean isAutomatic, double mileage, String fuelType) {
        super(type, brand, year, price, isAvailable, name, company, seatingCapacity, isDoubleDecker, yearCreation);
        this.numOfDoors = numOfDoors;
        this.color = color;
        this.isAutomatic = isAutomatic;
        this.mileage = mileage;
        this.fuelType = fuelType;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
