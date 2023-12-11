package com.logistics.garage.transports;

import com.logistics.garage.Transport;
import com.logistics.garage.features.Drivable;

import java.util.StringJoiner;

public class UndergroundTransport extends Transport implements Drivable {
    private String company;
    private int capacity;
    private int carsNumber; // кол-во вагонов
    private String metroLine;
    private int trafficInterval;

    @Override
    public void start() {
        System.out.println("Subway started");
    }
    public void drive(){
        System.out.println("Start moving");
    }
    public void stop(){
        System.out.println("Stop moving");
    }

    public UndergroundTransport(String type, String brand, int year, double price, boolean isAvailable, String company, int capacity, int carsNumber, String metroLine, int trafficInterval) {
        super(type, brand, year, price, isAvailable);
        this.company = company;
        this.capacity = capacity;
        this.carsNumber = carsNumber;
        this.metroLine = metroLine;
        this.trafficInterval = trafficInterval;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCarsNumber() {
        return carsNumber;
    }

    public void setCarsNumber(int carsNumber) {
        this.carsNumber = carsNumber;
    }

    public String getMetroLine() {
        return metroLine;
    }

    public void setMetroLine(String metroLine) {
        this.metroLine = metroLine;
    }

    public int getTrafficInterval() {
        return trafficInterval;
    }

    public void setTrafficInterval(int trafficInterval) {
        this.trafficInterval = trafficInterval;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UndergroundTransport.class.getSimpleName() + "[", "]")
                .add("company='" + company + "'")
                .add("capacity=" + capacity)
                .add("carsNumber=" + carsNumber)
                .add("metroLine='" + metroLine + "'")
                .add("trafficInterval=" + trafficInterval + "min")
                .toString();
    }
}
