package com.HungerZero;

public class clientFormData {
    private String name;
    private String address;
    private String phoneNumber;
    private String location;
    private int foodForPax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getFoodForPax() {
        return foodForPax;
    }

    public void setFoodForPax(int foodForPax) {
        this.foodForPax = foodForPax;
    }

    @Override
    public String toString() {
        return "clientFormData{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", location='" + location + '\'' +
                ", foodForPax=" + foodForPax +
                '}';
    }
}
