package com.pb.pomaza.hw10;

public class Number<T extends NumBox {
    public Number(T[] array) {
        this.array = array.clone();
    }

    public static void main(String[] args) {
        Number<Double> doubleMatrix = new Number<>(new Double[2]);
        Number<Integer> integerMatrix = new Number<>(new Integer[4]);
        Number<Byte> byteMatrix = new Number<>(new Byte[7]);
    }
}
        }
