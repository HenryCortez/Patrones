package com.henry.cortez.factory.shapes;

public class TriangleRectangle implements GeometricShape{

    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void create() {
        System.out.println("Creating a triangle with base: " + base + " and height: " + height);
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        return  base + height + Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
    
    @Override
    public void setAttributes(double... attributes) {
        if(attributes.length != 2){
            throw new IllegalArgumentException("Triangle needs two attributes");
        }
        setBase(attributes[0]);
        setHeight(attributes[1]);
    }
}
