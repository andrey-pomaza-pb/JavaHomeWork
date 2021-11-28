package com.pb.pomaza.hw10;



public class FixedSizedNumb<T extends Number> {

    private final T[] numb;

    @SuppressWarnings("unchecked")
    public FixedSizedNumb
            (int size) {


        numb = (T[]) new Number[1000];
    }

    public T get(int index) {
        return numb[index];
    }

    public void set(int index, T number) {
        this.numbs[index] = number;
    }

}
