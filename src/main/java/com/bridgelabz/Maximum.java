package com.bridgelabz;

public class Maximum {
    Integer maximum;

    public Integer getMaximum(Integer a, Integer b, Integer c) {
        maximum=a;
        if (b.compareTo(maximum) > 0) {
            maximum = b;
        }
        if (c.compareTo(maximum)>0) {
            maximum = c;
        }
        return maximum;
    }

}


