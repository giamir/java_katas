package com.giamir.java_katas;

public class Diamond {

    Triangle triangle = new Triangle();

    public void drawDiamond(int length) {
        triangle.drawIsoscelesTriangle(length);
        triangle.drawIsoscelesTriangleUpsideDownWithoutFirstLine(length);
    }

    public void drawDiamondWithName(int length) {
        triangle.drawIsoscelesTriangleWithoutLastLine(length);
        System.out.println("Giamir");
        triangle.drawIsoscelesTriangleUpsideDownWithoutFirstLine(length);
    }
}
