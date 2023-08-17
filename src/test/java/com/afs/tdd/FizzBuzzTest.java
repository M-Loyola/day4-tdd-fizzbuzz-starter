package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_the_given_number_when_countOff_given_a_normal_number(){ //not a multiple of 3 or 5
        //Given
        int normalNumber = 1;
        FizzBuzz fizzbuzz = new FizzBuzz();
        
        //when
        String result = fizzbuzz.countOff(normalNumber);

        //Then
        Assertions.assertEquals("1", result);
    }
}
