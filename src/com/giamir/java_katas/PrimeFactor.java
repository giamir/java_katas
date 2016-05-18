package com.giamir.java_katas;

import java.util.*;

public class PrimeFactor {

    private List<Integer> primeFactors = new ArrayList<Integer>();

    public List<Integer> generate(int num) {
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                primeFactors.add(i);
                num /= i;
            }
        }
        return primeFactors;
    }
}
