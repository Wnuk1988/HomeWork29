package com.SOLID.LiskovSubstitution;

public class EquilateralTriangle extends Triangle {
    @Override
    void perimeter() {
        System.out.println(getX() + getY() + getZ());
    }

    void perimeterTwo() {
        if (getX() == getY() || getX() == getZ()) {
            System.out.println(getX() * 2 + getZ());
        } else if (getX() == getZ()) {
            System.out.println(getX() * 2 + getY());
        } else {
            System.out.println(getY() * 2 + getX());
        }
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }

    @Override
    public void setZ(int z) {
        super.setZ(z);
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public int getZ() {
        return super.getZ();
    }
}
