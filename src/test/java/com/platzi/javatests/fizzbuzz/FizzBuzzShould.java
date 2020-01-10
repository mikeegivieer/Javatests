package com.platzi.javatests.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzShould {

    @Test
    public void return_fizz_when_numer_is_divisible_by_3() {
        assertThat(FizzBuzz.fizzBuzz(6), is("Fizz"));
    }

    @Test
    public void return_buzz_when_numer_is_divisible_by_5() {
        assertThat(FizzBuzz.fizzBuzz(10), is("Buzz"));
    }

    @Test
    public void retun_fizzbuzz_when_number_is_divisible_by_3_and_5() {
        assertThat(FizzBuzz.fizzBuzz(30), is("FizzBuzz"));
    }

    @Test
    public void retun_number_when_is_not_divisible_by_3_and_5() {
        assertThat(FizzBuzz.fizzBuzz(2), is("2"));
    }
}