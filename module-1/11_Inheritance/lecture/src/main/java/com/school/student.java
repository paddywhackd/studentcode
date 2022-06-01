package com.school;

public class student extends Person {


   private String year;

    public student(String name, int id) {
        super(name, id);
        this.year = year;
    }


    @Override
    public String getName() {
        String myName = super.getName();
        return myName + ", the " + year;
    }

    public void getUnits(int units) {
        this.units = units;

    }
    public int stressLevel() {





}
