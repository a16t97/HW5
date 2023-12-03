public class LandTransport extends Transport{
    private String name;
    private String company;
    private int seatingCapacity;
    private boolean isDoubleDecker;
    private int yearEnding;
    @Override
    public void start() {
        System.out.println("Car started");
    }


    public LandTransport(String type, String brand, int year, double price, boolean isAvailable, String name, String company, int seatingCapacity, boolean isDoubleDecker, int yearEnding) {
        super(type, brand, year, price, isAvailable);
        this.name = name;
        this.company = company;
        this.seatingCapacity = seatingCapacity;
        this.isDoubleDecker = isDoubleDecker;
        this.yearEnding = yearEnding;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public boolean isDoubleDecker() {
        return isDoubleDecker;
    }

    public void setDoubleDecker(boolean doubleDecker) {
        isDoubleDecker = doubleDecker;
    }

    public int getYearEnding() {
        return yearEnding;
    }

    public void setYearEnding(int yearEnding) {
        this.yearEnding = yearEnding;
    }

    @Override
    public String toString() {
        return "LandTransport{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                ", isDoubleDecker=" + isDoubleDecker +
                ", yearEnding=" + yearEnding +
                '}';
    }
}
