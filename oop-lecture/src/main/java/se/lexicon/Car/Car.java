package se.lexicon;

import java.time.LocalDate;

public class Car {
    // Fields or Attributes or Members
    private String id;
    private String brand;   // String has default value "null" always
    private String model;
    private String color;
    private Integer year;
    private double mileage; // String has default value "0.0" always

    // Methods
    public void start() {
        System.out.println("The Car is Starting....");
    }

    public String carInfo() {
        return "Car Brand: " + brand + " Model: " + model;
    }

    public void drive(double distance) {
        mileage += distance;
    }

    public double getMileage() {
        return mileage;
    }

    public void setBrand(String brand) {
        if (brand == null) {
            throw new IllegalArgumentException("Brand cannot be null");
        }
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        if (model == null) {
            throw new IllegalArgumentException("Model cannot be null");
        }
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        if (color == null) {
            this.color = "Gray";
        } else {
            this.color = color;
        }
    }

    public String getColor() {
        return color;
    }

    public void setYear(Integer year) {
        if (year == null) {
            this.year = LocalDate.now().getYear();
        } else {
            this.year = year;
        }
    }

    public Integer getYear() {
        return year;
    }
}