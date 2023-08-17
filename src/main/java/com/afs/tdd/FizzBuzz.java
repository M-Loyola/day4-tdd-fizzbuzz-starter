package com.afs.tdd;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String countOff(int number) {
        if (number %15 == 0 && number %7 == 0) {
            return "FizzBuzzWhizz";
        }
        else if (number %15 == 0) {
            return "FizzBuzz";
        } else if (number %3 == 0) {
            return "Fizz";
        } else if (number %5 == 0) {
            return "Buzz";
        } else if (number %7 == 0) {
            return "Whizz";
        }
        return String.valueOf(number);
    }
}