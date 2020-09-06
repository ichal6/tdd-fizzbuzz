package com.codecool;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {

    public List<String> convertToList(int i) {
        List<String> stringList = new LinkedList<>();
        for(int j = 1; j <= i; j++){
            stringList.add(String.valueOf(j));
        }
        return stringList;
    }
}
