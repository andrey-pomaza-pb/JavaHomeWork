package com.pb.pomaza.hw6;

public class Demo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Каша и кости", "Двор частного дома");
        animals[1] = new Cat("молоко", "комната");
        animals[2] = new Horse("Сено","конюшня");
    }
}