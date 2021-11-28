package com.pb.pomaza.hw10;
import java.util.*;
public class NumBox {

    public class NumBox<T extends Number> {
        private List<T> arr;
        private final int size;
        public NumBox(int size) {
            this.size = size;
            arr = new ArrayList<>(size);
        }
        public void add(T num) {
            if (arr.size() <= size-1)
                arr.add(num);
            else throw new ArrayIndexOutOfBoundsException();
        }
        public int length() {
            return arr.toArray().length;
        }

        public double average() {
            double sum = 0;
            for (T n : arr)  {
                sum += n.doubleValue();
            }
            return sum / arr.size();
        }
        public double sum() {
            double sum = 0;
            for (T n : arr)  {
                sum += n.doubleValue();
            }
            return sum;
        }
        public T max() {
            T maxValue = arr.get(0);
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).doubleValue() > maxValue.doubleValue())
                    maxValue = arr.get(i);
            }
            return maxValue;
        }
    }
}
