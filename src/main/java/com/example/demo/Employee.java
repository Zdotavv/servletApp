package com.example.demo;

public class Employee {

    private int id;
    private String brand;
    private String country;
    private String type;
    private String power;
    private String square;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSquare() {
        return square;
    }

    public void setSquare(String square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", country='" + country + '\'' +
                ", type='" + type + '\'' +
                ", power='" + power + '\'' +
                ", square='" + square + '\'' +
                '}';
    }
}
