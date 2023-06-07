package com.SOLID.LiskovSubstitution;

public class Main {
    public static void main(String[] args) {
        Triangle figure = new Triangle();
        figure.setX(5);
        figure.setY(10);
        figure.setZ(15);
        figure.perimeter();
        IsoscelesTriangle figure1 = new IsoscelesTriangle();
        figure1.setX(5);
        figure1.setY(30);
        figure1.setZ(30);
        figure1.perimeterTwo();
    }
}
