package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    List<String> stringList;
    FizzBuzz fizzBuzz;
    @BeforeEach
    void setup(){
        stringList = new LinkedList<>();
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldConvert1To1String()
    {
        stringList = fizzBuzz.convertToList(1);
        assertEquals(Arrays.asList("1"), stringList);
    }

    @Test
    public void shouldConvert2ToListOfString(){
        stringList = fizzBuzz.convertToList(2);
        assertEquals(Arrays.asList("1", "2"), stringList);
    }
}
