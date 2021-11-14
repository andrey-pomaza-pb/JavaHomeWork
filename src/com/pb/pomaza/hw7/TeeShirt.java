package com.pb.pomaza.hw7;

    public class TeeShirt extends Clothes implements ManClothes, WomenClothes{
        public TeeShirt(Sizes size, String color) {
            super(size, color);
        }

        public TeeShirt(Sizes size, String color, double cost) {
            super(size, color, cost);
        }

        @Override
        public String toString() {
            return "Футболочка{" +
                    "размер = " + getSize() +
                    ", цена = " + getCost() + " гривас" +
                    ", цвет = " + getColor() +
                    "}";
        }
    }

