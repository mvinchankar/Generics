package com.bridgelabz;

public class Maximum<T,U,V extends Comparable> {
    T maximumT;
    U maximumU;
    V maximumV;

    public Maximum(T maximumT, U maximumU, V maximumV) {
        this.maximumT = maximumT;
        this.maximumU = maximumU;
        this.maximumV = maximumV;
    }


    public static  <T extends Comparable> T getMaximum(T a, T b, T c) {
        T maximum = a;
        if (b.compareTo(maximum) > 0) {
            maximum = b;
        }
        if (c.compareTo(maximum) > 0) {
            maximum =  c;
        }
        return maximum;
    }
}


