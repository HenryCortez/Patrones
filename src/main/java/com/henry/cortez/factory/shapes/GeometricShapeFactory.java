package com.henry.cortez.factory.shapes;

import java.util.HashMap;
import java.util.Map;

public class GeometricShapeFactory {
    private static final Map<String, GeometricShape> shapeMap = new HashMap<>();

    static {
        shapeMap.put("CIRCLE", new Circle());
        shapeMap.put("SQUARE", new Square());
        shapeMap.put("TRIANGLE", new TriangleRectangle());
    }

    public static GeometricShape createShape(String shapeType, double... attributes){
        if (shapeType == null){
            return null;
        }
        GeometricShape shape = shapeMap.get(shapeType.toUpperCase());

        if(shape != null){
            shape.setAttributes(attributes);
        }
        return shape;
    }    
}
