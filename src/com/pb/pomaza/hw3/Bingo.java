package com.pb.pomaza.hw3;

import java.util.Scanner;
public class Bingo {
    public static void main(String[] args) {
        int UnknownNumber;
        int UserNumber;
        int TrysCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Задание: Угадать целое число от 0 до 100.");
        System.out.println("для выхода введите  home");
        UnknownNumber = (68);
        do {
            TrysCount++;
            System.out.print("Введите предпологаемое число  ");
            UserNumber = input.nextInt();
            if (UserNumber > UnknownNumber)
                System.out.println("холодно");
            else if (UserNumber < UnknownNumber)
                System.out.println("гарячевато)");
            else System.out.println("BINGOO!");
            if (input.equals("home")) {
                break;
            }
        } while (UserNumber != UnknownNumber);
        System.out.println("попыток за игру" + TrysCount);
    }
}