package com.codecool;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {

    public List<String> convertToList(int i) {
        List<String> stringList = new LinkedList<>();
        for (int j = 1; j <= i; j++) {
            if (j % 3 == 0 && j % 5 == 0) {
                stringList.add("FizzBuzz");
            } else if (j % 3 == 0) {
                stringList.add("Fizz");
            } else if (j % 5 == 0) {
                stringList.add("Buzz");
            } else {
                stringList.add(String.valueOf(j));
            }
        }
        return stringList;
    }
}
