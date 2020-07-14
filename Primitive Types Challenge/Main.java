package com.company;

public class Main {

    public static void main(String[] args) {

        byte byteNumber = 5;
        short shortNumber = 10;
        int intNumber = 21;
        
        long longNumber = 50000 + (10 * (byteNumber + shortNumber + intNumber));
        System.out.println(longNumber);
    }
}
