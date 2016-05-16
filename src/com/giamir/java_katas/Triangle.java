package com.giamir.java_katas;

public class Triangle {

    public void printAsterisk() {
        System.out.print("*");
    }

    public void drawHorizontalLine(int length) {
        for (int i = 0; i < length; i++) {
            printAsterisk();
        }
    }

    public void drawVerticalLine(int length) {
        for (int i = 0; i < length; i++) {
            printAsterisk();
            System.out.println();
        }
    }

    public void drawRightTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            drawHorizontalLine(i);
            System.out.println();
        }
    }

}
