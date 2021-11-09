package com.pb.pomaza.hw6;



public class Cat extends Animal {
    private String color;

    public Cat() {
    }

    public Cat(String food, String location) {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест.");
    }

    @Override
    public String makeNoise() {
        return "Мя-я-я-я-я-я-у!!!!";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + getFood() + '\'' +
                ", location='" + getLocation() + '\'' +
                '}';
    }
}