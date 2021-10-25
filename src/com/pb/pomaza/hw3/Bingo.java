package com.pb.pomaza.hw3;


import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int rum = random.nextInt(101);
        int count = 0;
        System.out.println("Угадайте число от 0 до 100");
        System.out.println("для выхода введите home");
        while(true){
            System.out.print("Введите число:  ");
            String data = sc.next();
            if (data.equals("home")){
                break;
            }
            int num = Integer.parseInt(data);
            count++;
            if (num != rum){
                if (num < rum){
                    System.out.println(num + " < ?");
                }
                else {
                    System.out.println(num + " > ?");
                }
            }
            else {
                System.out.println("Вы победили!!!  " + num + ". число попыток - " + count);
                break;
            }

        }
        System.out.println("Игра окончена !");
    }
}