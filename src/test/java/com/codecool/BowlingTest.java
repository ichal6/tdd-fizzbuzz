package com.codecool;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BowlingTest {

    @Test
    public void shouldReturn300IfAllStrikes(){
        List<String> listOfRolls = Arrays.asList("X","X","X","X","X","X","X","X","X","X","X","X");
        Bowling bowling = new Bowling(listOfRolls);
        assertEquals(300, bowling.calculateResult());
    }

    @Test
    public void shouldReturn20PointsAfterStrike20Pins(){
        List<String> listOfRolls = Arrays.asList("11","11","11","11","11","11","11","11","11","11");
        Bowling bowling = new Bowling(listOfRolls);
        assertEquals(20, bowling.calculateResult());
    }

//    @Test
//    public void shouldReturn280IfAllStrikes(){
//        List<String> listOfRolls = Arrays.asList("X","X","X","X","X","X","X","X","X","X","X","42");
//        Bowling bowling = new Bowling(listOfRolls);
//        assertEquals(280, bowling.calculateResult());
//    }

}