package com.birdgelabz;

public class PrintArray<T,E,R> {
    T[] myArray;
    E[] myEArray;
    R[] myRArray;

    public PrintArray(T[] myArray, E[] myEArray, R[] myRArray) {
        this.myArray = myArray;
        this.myEArray = myEArray;
        this.myRArray = myRArray;
    }

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {0.1, 0.2, 0.03, 0.004};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        new PrintArray<Integer,Double,Character>(integerArray,doubleArray,charArray).toPrint();
    }

    private void toPrint() {
        toPrint(myArray);
        toPrint(myEArray);
        toPrint(myRArray);

    }

    private static <T> void toPrint(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }


}
