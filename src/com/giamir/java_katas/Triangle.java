package com.giamir.java_katas;

public class Triangle {

    public void printAsterisk() {
        System.out.print("*");
    }

    public void drawHorizontalLine(int length) {
        for (int i=0; i < length; i++) {
            printAsterisk();
        }
    }

}
