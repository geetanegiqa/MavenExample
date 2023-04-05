package com.qagenic.training;

public class RecursionExample {

    public int addTill(int number) {
        if (number > 0)
            return number + addTill(number - 1);
        else
            return 0;
    }

    public int factorial(int number) {
        if (number > 0)
            return number * factorial(number - 1);
        else
            return 1;
    }
}
