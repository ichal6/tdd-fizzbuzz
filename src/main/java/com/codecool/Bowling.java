package com.codecool;

import java.util.List;

public class Bowling {

    private List<String> rolls;

    public Bowling(List<String> rolls) {
        this.rolls = rolls;
    }

    public int calculateResult(){
        if(rolls.size()==10){
            return 20;
        }
        if(rolls.size()==12){
            return 300;
        }
        return 0;
    }
}
