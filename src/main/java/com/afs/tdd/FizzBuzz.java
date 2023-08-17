package com.afs.tdd;

public class FizzBuzz {

    public String countOff(int number) {
        boolean multipleOfThree = number % 3 == 0;
        boolean multipleOfFive = number % 5 == 0;
        boolean multipleOfSeven = number % 7 == 0;
        boolean multipleOfThreeFive = multipleOfThree && multipleOfFive;
        boolean multipleOfThreeSeven = multipleOfThree && multipleOfSeven;
        boolean multipleOfFiveSeven = multipleOfFive && multipleOfSeven;
        boolean multipleOfThreeFiveSeven = multipleOfThree && multipleOfFive && multipleOfSeven;

        if (multipleOfThreeFiveSeven) {return "FizzBuzzWhizz";}
        if (multipleOfThreeFive) {return "FizzBuzz";}
        if (multipleOfFiveSeven) {return "BuzzWhizz";}
        if (multipleOfThreeSeven) {return "FizzWhizz";}
        if (multipleOfThree) {return "Fizz";}
        if (multipleOfFive) {return "Buzz";}
        if (multipleOfSeven) {return "Whizz";}

        return String.valueOf(number);
    }
}