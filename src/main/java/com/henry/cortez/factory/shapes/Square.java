package com.henry.cortez.factory.shapes;

public class Square implements GeometricShape{
    private static double side;

    
    @Override
    public void create() {
        System.out.println("Creating a square with side: " + side);
    }
    public static double getSide() {
        return side;
    }
    public static void setSide(double side) {
        Square.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
    @Override
    public double getPerimeter() {
        return 4 * side;
    }
    @Override
    public void setAttributes(double... attributes) {
        if(attributes.length != 1){
            throw new IllegalArgumentException("Square needs only one attribute");
        }
        Square.setSide(attributes[0]);
    }
}
