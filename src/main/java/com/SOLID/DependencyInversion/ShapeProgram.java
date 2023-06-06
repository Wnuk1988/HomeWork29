package com.SOLID.DependencyInversion;

public class ShapeProgram {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Red", 6, 7, 30);
        shapes[1] = new Circle("Green", 8, 9, 40);
        shapes[2] = new Rectangle("Blue", 10, 15, 20, 32);
        shapes[3] = new Rectangle("Black", 15, 12, 25, 34);
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
