package com.giamir.java_katas;

public class Fizzbuzz {

    final int MAX_NUMBER = 100;

    public void run() {
        for (int i = 1; i <= MAX_NUMBER; i++) {
            if (isDivisibleBy3and5(i)) System.out.println("FizzBuzz");
            else if (isDivisibleBy3(i)) System.out.println("Fizz");
            else if (isDivisibleBy5(i)) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    private boolean isDivisibleBy3(int num) {
        return num % 3 == 0;
    }

    private boolean isDivisibleBy5(int num) {
        return num % 5 == 0;
    }

    private boolean isDivisibleBy3and5(int num) {
        return num % 15 == 0;
    }

}
