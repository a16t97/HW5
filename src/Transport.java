public abstract class Transport {
    private String type;
    private String brand;
    private int year;
    private double price;
    private boolean isAvailable;

    public abstract void start();

    public Transport(String type, String brand, int year, double price, boolean isAvailable) {
        this.type = type;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int yearCreation) {
        this.year = yearCreation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
