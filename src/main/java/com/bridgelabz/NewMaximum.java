package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;

public class NewMaximum<T extends Comparable> {
    T[] valueArr;

    public NewMaximum(T... val) {
        System.out.println();
        T[] array = (T[]) new Comparable[val.length];
        int i = 0;
        for (T c : val) {
            array[i] = c;
            i++;
        }
        this.valueArr = array;
    }

    public T check() {
        Arrays.sort(valueArr);
        return valueArr[valueArr.length - 1];
    }
}
