package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void should_return_the_given_number_when_countOff_given_a_normal_number(){
        int normalNumber = 1;
        String result = fizzBuzz.countOff(normalNumber);
        Assertions.assertEquals("1", result);
    }

    @Test
    public void should_return_string_fizz_when_countOff_given_a_number_multiple_of_three() {
        int numberMultipleOf3 = 3;
        String actualResult = fizzBuzz.countOff(numberMultipleOf3);
        Assertions.assertEquals("Fizz",actualResult);
    }

    @Test
    public void should_return_string_buzz_when_countOff_given_a_number_multiple_of_five() {
        int numberMultipleOf5 = 5;
        String actualResult = fizzBuzz.countOff(numberMultipleOf5);
        Assertions.assertEquals("Buzz",actualResult);
    }

    @Test
    public void should_return_string_FizzBuzz_when_countOff_given_a_common_multiple_number_of_three_and_five() {
        int numberMultipleOf3And5 = 15;
        String actualResult = fizzBuzz.countOff(numberMultipleOf3And5);
        Assertions.assertEquals("FizzBuzz", actualResult);
    }
}
