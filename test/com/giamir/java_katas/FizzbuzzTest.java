package com.giamir.java_katas;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class FizzbuzzTest {

    private String lines[];

    @Before
    public void beforeEach() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        fizzbuzz.run();
        lines = outputStream.toString().split("\\r?\\n");
    }

    @Test
    public void runShouldPrintFizzIfNumberIsDivisibleBy3ButNotBy5() {
        assertEquals("Fizz", lines[3 - 1]);
    }

    @Test
    public void runShouldPrintBuzzIfNumberIsDivisibleBy5ButNotBy3() {
        assertEquals("Buzz", lines[5 - 1]);
    }

    @Test
    public void runShouldPrintFizzBuzzIfNumberIsDivisibleBy3AndBy5() {
        assertEquals("FizzBuzz", lines[15 - 1]);
    }

    @Test
    public void runShouldPrintTheNumberIfNumberIsNotDivisibleBy3OrBy5() {
        assertEquals("7", lines[7 - 1]);
    }

}
