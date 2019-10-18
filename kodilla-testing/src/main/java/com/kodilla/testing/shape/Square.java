package com.kodilla.testing.shape;

public class Square implements Shape {

    private final static String name = "Square";
    private double lengthOfEdge;

    public Square(double lengthOfEdge) {
        this.lengthOfEdge = lengthOfEdge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.lengthOfEdge, lengthOfEdge) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(lengthOfEdge);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return name + ", " + lengthOfEdge;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return (lengthOfEdge * lengthOfEdge);
    }
}
