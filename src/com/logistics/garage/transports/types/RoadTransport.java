package com.logistics.garage.transports.types;

import com.logistics.garage.features.Drivable;
import com.logistics.garage.list.fuelType;
import com.logistics.garage.transports.LandTransport;

public class RoadTransport extends LandTransport implements Drivable {
    private int numOfDoors;
    private String color;
    private boolean isAutomatic;
    private double mileage;
    private fuelType fuelType;

    public void drive(){
        System.out.println("Start moving");
    }
    public void stop(){
        System.out.println("Stop moving");
    }

    public RoadTransport(String type, String brand, int year, double price, boolean isAvailable, String name, String company, int seatingCapacity, boolean isDoubleDecker, int yearEnding, int numOfDoors, String color, boolean isAutomatic, double mileage, com.logistics.garage.list.fuelType fuelType) {
        super(type, brand, year, price, isAvailable, name, company, seatingCapacity, isDoubleDecker, yearEnding);
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

    public fuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(fuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "com.logistics.garage.types.land.RoadTransport{" +
                "numOfDoors=" + numOfDoors +
                ", color='" + color + '\'' +
                ", isAutomatic=" + isAutomatic +
                ", mileage=" + mileage +
                ", com.logistics.garage.fuel.fuelType=" + fuelType +
                '}';
    }
}
