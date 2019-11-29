package com.bridgelabz;

public class Maximum<T extends Comparable> {
    private T maximumT;
    private T maximumU;
    private T maximumV;

    public Maximum(T maximumT, T maximumU, T maximumV) {
        this.maximumT = maximumT;
        this.maximumU = maximumU;
        this.maximumV = maximumV;
    }


    public static <T extends Comparable> T testMax(T maximumT, T maximumU, T maximumV) {
        T maximum = maximumT;
        if (maximumU.compareTo(maximum) > 0) {
            maximum = maximumU;
        }
        if (maximumV.compareTo(maximum) > 0) {
            maximum = maximumV;
        }
        printMax(maximum);
        return maximum;
    }

    public <T> T testMax() {
        T maxElememt = (T) testMax(this.maximumT, this.maximumU, this.maximumV);
        printMax(maxElememt);
        return maxElememt;

    }

    private static <T> void printMax(T maximumValue) {
        System.out.println(maximumValue);
    }
}


