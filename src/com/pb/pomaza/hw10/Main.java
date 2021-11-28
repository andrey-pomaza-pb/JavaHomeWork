package com.pb.pomaza.hw10;


    public class Main {
        public static void main(String[] args) {
            NumBox<Integer> nbi = new NumBox<Integer>(4);
            try {
                nbi.add(1);
                nbi.add(2);
                nbi.add(3);
                nbi.add(4);
                nbi.add(5);
            } catch (Exception e) {
                System.err.println("Невозможно добавить элемент." +
                        "\nМассив переполнен!");
            }
            System.out.println("Размер массива nbi: " + nbi.length());
            System.out.println("Среднее массива nbi: " + nbi.average());
            System.out.println("Сумма массива nbi: " + nbi.sum());
            System.out.println("Max массива nbi: " + nbi.max());
            System.out.println();
            NumBox<Float> nbf = new NumBox<Float>(4);
            try {
                nbf.add(1.1F);
                nbf.add(2.2F);
                nbf.add(3.3F);
                nbf.add(4.4F);
            } catch (Exception e) {
                System.err.println("Массив переполнен!");
            }
            System.out.println("Размер массива nbf: " + nbf.length());
            System.out.println("Среднее массива nbf: " + nbf.average());
            System.out.println("Сумма массива nbf: " + nbf.sum());
            System.out.println("Max массива nbf: " + nbf.max());
        }
    }