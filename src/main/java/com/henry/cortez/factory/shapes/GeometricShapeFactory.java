package com.henry.cortez.factory.shapes;

public class GeometricShapeFactory {
    public static GeometricShape createShape(String shapeType, double... attributes){
        if (shapeType == null){
            return null;
        }
        GeometricShape shape = null;
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            shape = new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")){
            shape = new Square();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")){
            shape = new TriangleRectangle();
        }

        if(shape != null){
            shape.setAttributes(attributes);
        }
        return shape;
    }    
}
