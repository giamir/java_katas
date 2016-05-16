package com.giamir.java_katas;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class DiamondTest {

    private ByteArrayOutputStream outputStream;
    private Diamond diamond;

    @Before
    public void beforeEach() {
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        diamond = new Diamond();
    }

    @Test
    public void drawDiamondShouldDrawACenteredDiamond() {
        diamond.drawDiamond(3);
        assertEquals("  *\n ***\n*****\n ***\n  *\n", outputStream.toString());
    }
}
