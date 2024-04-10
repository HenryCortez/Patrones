package com.henry.cortez.factory.shapes;

public interface GeometricShape {
    public void create();
    public double getArea();
    public double getPerimeter();
    public void setAttributes(double... attributes);
}
