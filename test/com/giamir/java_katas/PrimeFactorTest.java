package com.giamir.java_katas;

import java.util.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeFactorTest {

    private PrimeFactor primeFactor;

    @Before
    public void beforeEach() {
        primeFactor = new PrimeFactor();
    }

    @Test
    public void generateShouldReturnAListOfIntInIcreasingNumericalOrder() {
        List<Integer> primeFactors = primeFactor.generate(10);
        assertTrue("List have to be arranged in increasing numerical order", primeFactors.get(1) > primeFactors.get(0));
    }

    @Test
    public void generateShouldReturnAListOfPrimeFactorsIntOfTheGivenNumber() {
        List<Integer> primeFactorsOf30 = Arrays.asList(2, 3, 5);
        List<Integer> primeFactors = primeFactor.generate(30);
        assertEquals(primeFactors, primeFactorsOf30);
    }
}
