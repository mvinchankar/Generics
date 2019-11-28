package com.bridgelabz;

public class Maximum<T extends Comparable> {
    T maximum;

    public T getMaximum(T a, T b, T c) {
        maximum = a;
        if (b.compareTo(maximum) > 0) {
            maximum = b;
        }
        if (c.compareTo(maximum) > 0) {
            maximum = c;
        }
        return maximum;
    }
}


