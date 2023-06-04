package com.SOLID.LiskovSubstitution;

public class Main {
    public static void main(String[] args) {
        Triangle figure = new Triangle();
        figure.setX(5);
        figure.setY(10);
        figure.setZ(15);
        figure.perimeter();
        Triangle figure1 = new EquilateralTriangle();
        figure1.setX(5);
        figure1.setY(10);
        figure1.setZ(15);
        figure1.perimeter();
    }
}
