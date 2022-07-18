package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird implements Animal{
    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String color() {
        return "red";
    }
}
