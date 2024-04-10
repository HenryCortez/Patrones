package com.henry.cortez.factory;

import com.henry.cortez.factory.shapes.GeometricShape;
import com.henry.cortez.factory.shapes.GeometricShapeFactory;
import com.henry.cortez.factory.shapes.Square;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GeometricShape square = GeometricShapeFactory.createShape("SQUARE", 5);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        GeometricShape triangle = GeometricShapeFactory.createShape("TRIANGLE", 5, 10);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

    }
}
