package com.pb.pomaza.hw6;

import java.util.Objects;

public class Cat extends Animal {

    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void makeNoise() {
        System.out.println("мяу мяу!!! ");
    }

    @Override
    public void eat() {
        System.out.println(name+ " нямкает");
    }
}