package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private final static String name = "Triangle";
    private double height;
    private double lengthOfBase;

    public Triangle(double height, double lengthOfBase) {
        this.height = height;
        this.lengthOfBase = lengthOfBase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.height, height) != 0) return false;
        return Double.compare(triangle.lengthOfBase, lengthOfBase) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(height);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(lengthOfBase);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return name + ", " + height + lengthOfBase;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return (height * lengthOfBase) / 2;
    }
}
