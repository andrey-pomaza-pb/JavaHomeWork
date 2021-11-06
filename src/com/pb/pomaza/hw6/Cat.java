package com.pb.pomaza.hw6;



public class Cat extends Animal {
    public String color;

    public Cat(String food, String location) {
        super();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Кошка кушает.");
    }

    @Override
    public String makeNoise() {
        return "Мяу!!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        return color != null ? color.equals(cat.color) : cat.color == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + getFood() + '\'' +
                ", location='" + getLocation() + '\'' +
                '}';
    }
}