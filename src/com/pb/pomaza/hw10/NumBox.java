package com.pb.pomaza.hw10;

public class NumBox<T> extends Number {

    private T[] numb;

    public NumBox(int size) {
        this.numb = (T[]) new Number[size];
    }

    public void set(T numb) {
        this.numb = numb;

        public int length () {
            int i = 0;
            for (T n : numb) {
                if (n == null) {
                    break;
                }
                i++;
                if (i == numb.length) {
                    System.out.println("mass is full");
                    break;
                }
            }

            public T max () {
                T maX = numbs[0];
                for (int i = 0; i < numbs.length; i++) {
                    if (Number[i].doubleValue() > maX.doubleValue()) {
                        maX = numbs[i];
                    }
                }
                return maX;
            }
        }
    }
}

