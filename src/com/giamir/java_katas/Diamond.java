package com.giamir.java_katas;

public class Diamond {

    Triangle triangle = new Triangle();

    public void drawDiamond(int length) {
        triangle.drawIsoscelesTriangle(length);
        triangle.drawIsoscelesTriangleUpsideDownWithoutFirstLine(length);
    }
}
