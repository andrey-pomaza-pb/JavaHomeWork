package com.pb.pomaza.hw7;

    public class Tie extends Clothes implements ManClothes{
        public Tie(Sizes size, String color) {
            super(size, color);
        }

        public Tie(Sizes size, String color, double cost) {
            super(size, color, cost);
        }

        @Override
        public String toString() {
            return "Галстук{" +
                    "размер = " + getSize() +
                    ", цена = " + getCost() + " гривас" +
                    ", цвет = " + getColor() +
                    "}";
        }
    }

