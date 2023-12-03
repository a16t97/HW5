public class WaterTransport extends Transport{
    private String name;
    private int weight;
    private int capacity;
    private boolean cruiseShip;
    private int yearEnding;
    @Override
    public void start() {
        System.out.println("Smoke came from the steamer");
    }

    public WaterTransport(String type, String brand, int year, double price, boolean isAvailable, String name, int weight, int capacity, boolean cruiseShip, int yearEnding) {
        super(type, brand, year, price, isAvailable);
        this.name = name;
        this.weight = weight;
        this.capacity = capacity;
        this.cruiseShip = cruiseShip;
        this.yearEnding = yearEnding;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isCruiseShip() {
        return cruiseShip;
    }

    public void setCruiseShip(boolean cruiseShip) {
        this.cruiseShip = cruiseShip;
    }

    public int getYearEnding() {
        return yearEnding;
    }

    public void setYearEnding(int yearEnding) {
        this.yearEnding = yearEnding;
    }
}
