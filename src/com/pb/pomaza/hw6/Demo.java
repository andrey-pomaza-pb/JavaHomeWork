package com.pb.pomaza.hw6;

private class VetСliniс {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Каша и кости", "Двор частного дома");
        animals[1] = new Cat("Молоко и рыба", "Квартира");
        animals[2] = new Horse("Cено", "вода ");

        for (Animal animal : animals) {
            VetСliniс.treatAnimal(animal);
        }
    }
}