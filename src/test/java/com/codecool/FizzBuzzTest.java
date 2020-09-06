package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    List<String> stringList;
    FizzBuzz fizzBuzz;

    @BeforeEach
    void setup() {
        stringList = new LinkedList<>();
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldConvert1To1String() {
        stringList = fizzBuzz.convertToList(1);
        assertEquals(Arrays.asList("1"), stringList);
    }

    @Test
    public void shouldConvert2ToListOfString() {
        stringList = fizzBuzz.convertToList(2);
        assertEquals(Arrays.asList("1", "2"), stringList);
    }

    @Test
    public void shouldCovert3ToListOfString() {
        stringList = fizzBuzz.convertToList(3);
        assertEquals(Arrays.asList("1", "2", "Fizz"), stringList);
    }

    @Test
    public void shouldCovert5ToListOfString() {
        stringList = fizzBuzz.convertToList(5);
        assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz"), stringList);
    }

    @Test
    public void shouldCovert15ToListOfString() {
        stringList = fizzBuzz.convertToList(15);
        assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz"), stringList);
    }
}