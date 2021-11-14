package com.pb.pomaza.hw6;

public class VetClinic {
    public static void main(String[] args) {

         Cat cat = new Cat ("Мурашка", "черно-белая");
         cat.setFood("Молоко и корм");
         cat.setLocation( "Домик ");

        Cat cat2 = new Cat ("Мур", "черная");
        cat.setFood("корм");
        cat.setLocation( "омик ");

        Horse horse = new Horse("Антуан", 1230);
        horse.setFood("овес");
        horse.setLocation("поле");

        Dog dog = new Dog ("Рекс", "овчарка");
        dog.setFood("кости");
        dog.setLocation("будка");


        Animal [] animals = new Animal[] { cat, cat2, horse, dog};


    }
}
