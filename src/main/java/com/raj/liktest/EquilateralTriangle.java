package com.raj.liktest;

public class EquilateralTriangle {

    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    public static void main(String[] args) {

        EquilateralTriangle triangle =
                new EquilateralTriangle(4);

        double area = triangle.calculateArea();

        System.out.println("Side of Triangle : 4");
        System.out.println("Area of Triangle : " + area);
    }
}