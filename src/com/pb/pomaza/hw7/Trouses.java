package com.pb.pomaza.hw7;

class Trousers extends Clothes implements ManClothes, WomenClothes{
    public Trousers(Sizes size, String color) {
        super(size, color);
    }

    public Trousers(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Штаны{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " ,гривас" +
                ", цвет = " + getColor() +
                "}";
    }
}
