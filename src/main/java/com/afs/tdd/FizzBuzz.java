package com.afs.tdd;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String countOff(int number) {
        if (number %3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}