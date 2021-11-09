package com.pb.pomaza.hw6;

public abstract class Animal {
    private String food;
    private String location;



    public String getFood() {
        return food;
    }

    public void setFood (String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public abstract void eat();

    public abstract String makeNoise();

    public void sleep() {
        System.out.println("Животное спит.");
    }
}


