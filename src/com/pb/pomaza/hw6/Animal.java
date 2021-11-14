package com.pb.pomaza.hw6;

import java.util.Objects;

public class Animal {

    protected String food;
    protected String location;
    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        if (food != null && !food.isEmpty()) {
            this.food = food;
        }
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void makeNoise() {
        System.out.println(" Тварына орет ! ");;
    }

    public void eat() {
        System.out.println("животное ест");
    }

    public void sleep() {
        System.out.println("животное спит");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(food, animal.food)
                && Objects.equals(location, animal.location)
                && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, location, name);
    }
}










