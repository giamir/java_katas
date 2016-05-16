package com.giamir.java_katas;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class TriangleTest {

    private ByteArrayOutputStream outputStream;
    private Triangle triangle;

    @Before
    public void beforeEach() {
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        triangle = new Triangle();
    }

    @Test
    public void printAsteriskShouldPrintASingleAsterisk() {
        triangle.printAsterisk();
        assertEquals("*", outputStream.toString());
    }

}