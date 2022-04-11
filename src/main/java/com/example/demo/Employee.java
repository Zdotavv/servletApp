package com.example.demo;

public class Employee {

    private int id;
    private String name;
    private String country;
    private String email;
    private String phoneNumber;
    private String gender;
    private String birthdayDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {return phoneNumber;}

    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public String getGender() {return gender;}

    public void setGender(String gender) {this.gender = gender;}

    public String getBirthdayDate() {return birthdayDate;}

    public void setBirthdayDate(String birthdayDate) {this.birthdayDate = birthdayDate;}

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", birthdayDate=" + birthdayDate +
                '}';
    }
}
