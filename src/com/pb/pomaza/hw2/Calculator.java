package com.pb.pomaza.hw2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        System.out.print("Введите число");
        operand1 = scan.nextInt();

        System.out.print("Введите число");
        operand2 = scan.nextInt();
        System.out.print("Какое действие?(+-*/)?");
        //}
        String sign = scan.next(); // + - * /

        switch (sign) {
            case "+":
                System.out.println(+(operand1 + operand2));
                break;

            case "-":
                System.out.println(+(operand1 - operand2));
                break;

            case "*":
                System.out.println(+(operand1 * operand2));
                break;

            case "/":
                System.out.println(+(operand1 / operand2));
            {
                if (operand2 == 0) ;
                System.out.println("На ноль делить нельза ");
            }
            break;

            default: {
                System.out.println("Неверно");
            }


        }


    }
}
