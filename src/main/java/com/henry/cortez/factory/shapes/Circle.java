package com.henry.cortez.factory.shapes;

public class Circle implements GeometricShape{

    private double radius;



    @Override
    public void create() {
        System.out.println("Creating a circle");
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void setAttributes(double... attributes) {
        if(attributes.length != 1){
            throw new IllegalArgumentException("Circle needs only one attribute");
        }
        setRadius(attributes[0]);
    }
    
}
