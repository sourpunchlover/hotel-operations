package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites, numberOfRooms, bookedSuites, bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public int getAvailableSuites() {
        return numberOfRooms - bookedBasicRooms;
    }

    public int getAvailableRooms() {
        return numberOfSuites - bookedSuites;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (getAvailableSuites() >= numberOfRooms) {
                bookedSuites += numberOfRooms;
                return true;
            } else {
                return false;
            }
        } else {
            if (getAvailableRooms() >= numberOfRooms) {
                bookedBasicRooms += numberOfRooms;
                return true;
            } else {
                return false;
            }
        }
    }
}
