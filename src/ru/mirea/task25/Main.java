package ru.mirea.task25;

interface Shape{
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw(){
        System.out.println("Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw(){
        System.out.println("Rectangle");
    }
}

interface ShapeDecorator extends Shape {
    Shape shape = null;
    Shape Shape();
}

class RedShapeDecorator {
    public Shape shape;

    public RedShapeDecorator(){
        System.out.println("RedShapeDecorator");
    }
    public void draw(){
        setRedBorder();
    }
    private void setRedBorder() {
        System.out.println("Set Red Border");
    }
}

public class Main{
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        RedShapeDecorator decorator = new RedShapeDecorator();
        circle.draw();
        rectangle.draw();
        decorator.draw();
    }
}
