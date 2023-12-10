package com.logistics.garage.builders;

import com.logistics.garage.list.fuelType;
import com.logistics.garage.transports.types.RoadTransport;

public class RoadTransportBuilder {
    private String type;
    private String brand;
    private int year;
    private double price;
    private boolean isAvailable;
    private String name;
    private String company;
    private int seatingCapacity;
    private boolean isDoubleDecker;
    private int yearEnding;
    private int numOfDoors;
    private String color;
    private boolean isAutomatic;
    private double mileage;
    private com.logistics.garage.list.fuelType fuelType;

    public RoadTransportBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public RoadTransportBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public RoadTransportBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public RoadTransportBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public RoadTransportBuilder setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    public RoadTransportBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public RoadTransportBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public RoadTransportBuilder setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
        return this;
    }

    public RoadTransportBuilder setIsDoubleDecker(boolean isDoubleDecker) {
        this.isDoubleDecker = isDoubleDecker;
        return this;
    }

    public RoadTransportBuilder setYearEnding(int yearEnding) {
        this.yearEnding = yearEnding;
        return this;
    }

    public RoadTransportBuilder setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
        return this;
    }

    public RoadTransportBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public RoadTransportBuilder setIsAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
        return this;
    }

    public RoadTransportBuilder setMileage(double mileage) {
        this.mileage = mileage;
        return this;
    }

    public RoadTransportBuilder setFuelType(fuelType fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public RoadTransport createRoadTransport() {
        return new RoadTransport(type, brand, year, price, isAvailable, name, company, seatingCapacity, isDoubleDecker, yearEnding, numOfDoors, color, isAutomatic, mileage, fuelType);
    }
}