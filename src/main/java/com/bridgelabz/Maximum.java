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


    public static  <T extends Comparable> T testMax(T a, T b, T c) {
        T maximum = a;
        if (b.compareTo(maximum) > 0) {
            maximum = b;
        }
        if (c.compareTo(maximum) > 0) {
            maximum =  c;
        }
        printMax(maximum);
        return maximum;
    }
    public <T> T testMax(){
        T maxElememt= (T) testMax(this.maximumT, this.maximumU, this.maximumV);
        printMax(maxElememt);
        return maxElememt;

    }
    private static <T> void printMax(T maximumValue){
        System.out.println(maximumValue);
    }
}


