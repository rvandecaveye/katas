package com.fidzit.kata;

public class FizzBuzz {
    public static String build(int limit) {
        StringBuilder ret = new StringBuilder();
        for (int i = 1; i <= limit; i++) {
            if (i % 15 == 0) {
                ret.append("FizzBuzz");
            } else if (i % 3 == 0) {
                ret.append("Fizz");
            } else if (i % 5 == 0) {
                ret.append("Buzz");
            } else {
                ret.append(i);
            }
        }
        return ret.toString();
    }
}
