package com.pb.pomaza.hw3;

import java.util.Scanner;
import java.util.Arrays;


public class Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Заполните массив");
        int mas[] = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = input.nextInt();
        }
        System.out.println("Заполненый массив");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");// Выводим заполненый массив на экран
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum = sum + mas[i];
        }
        System.out.println("сумма всех элементов =  " + sum);



        System.out.println("массив перед пузырьковой сортировкой : " + Arrays.toString(mas));


        bubbleSort(mas);


        System.out.println("массив после пузырьковой сортировки : " + Arrays.toString(mas));
    }



    public static void bubbleSort(int[] num) {
        int j;
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }

}