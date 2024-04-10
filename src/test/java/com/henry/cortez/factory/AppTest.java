package com.henry.cortez.factory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.henry.cortez.factory.shapes.GeometricShape;
import com.henry.cortez.factory.shapes.GeometricShapeFactory;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void Square()
    {
        GeometricShape square = GeometricShapeFactory.createShape("SQUARE", 5);
        assertTrue(square.getArea() == 25);
        assertTrue(square.getPerimeter() == 20);
    }
    @Test
    public void Triangle()
    {
        GeometricShape triangle = GeometricShapeFactory.createShape("Triangle", 5, 10);
        assertTrue(triangle.getArea() == 25);
        }
    @Test
    public void Circle()
    {
        GeometricShape Circle = GeometricShapeFactory.createShape("Circle", 5);
        assertTrue(Circle.getArea() == 78.53981633974483);
        assertTrue(Circle.getPerimeter() == 31.41592653589793);
    }
    @Test
    public void Null()
    {
        GeometricShape Null = GeometricShapeFactory.createShape("otra cosa", 5);
        assertTrue(Null == null);
    }
}
