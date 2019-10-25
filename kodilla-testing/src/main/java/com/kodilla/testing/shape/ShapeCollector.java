package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeCollectorList = new ArrayList<>();

    public List<Shape> getShapeCollectorList() {
        return shapeCollectorList;
    }

    public void addFigure(Shape shape){
        shapeCollectorList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapeCollectorList.contains(shape)){
            shapeCollectorList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        return shapeCollectorList.get(n);
    }

    public String showFigures(){
        return shapeCollectorList.toString();
    }
}
