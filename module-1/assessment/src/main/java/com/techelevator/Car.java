package com.techelevator;

public class Car {


    int year;
    String make;
    boolean isClassicCar;
    int age;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public boolean isClassicCar() {
        return isClassicCar;
    }

    public void setClassicCar(boolean classicCar) {
        isClassicCar = classicCar;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car(int year, String make, boolean isClassicCar) {
        this.year = year;
        this.make = make;
        this.isClassicCar = isClassicCar;
        this.age = age;


    }
    public boolean exempt (int yearToCheck) {
        boolean exempt = (yearToCheck % 2) == 0;
     if (exempt) {
            return true;
        } else {
        return false;
        }




    }
    }
