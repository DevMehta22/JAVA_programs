// Package pdeu.drawing

package PDEU.drawing;
import java.util.*;
abstract class Shape {
    private String color;
    private String pattern;

    public Shape(String color, String pattern) {
        this.color = color;
        this.pattern = pattern;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    static int count;
    {
        count++;
    }

    public static int countShapes() {
        
        return count;
    }
}

class Square extends Shape {
    private double side;

    public Square(String color, String pattern, double side) {
        super(color, pattern);
        this.side = side;
    }

    
    public double calculateArea() {
        return side * side;
    }

  
    public double calculatePerimeter() {
        return 4 * side;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, String pattern, double length, double width) {
        super(color, pattern);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle(String color, String pattern, double radius) {
        super(color, pattern);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void resize(int factor) {
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, String pattern, double side1, double side2, double side3) {
        super(color, pattern);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        return 0.5*side1*side2*side3;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

interface Resizeable {
    void resize(int factor);
}

public class Resize{
    public static void main(String[] args){
        Shape s1= new Square(null, null, 23);
        System.out.println("Area of Square:"+s1.calculateArea());
        System.out.println("Perimeter of Square: "+s1.calculatePerimeter());
        Shape s2= new Rectangle(null, null, 23,32);
        System.out.println("Area of Rectangle:"+s2.calculateArea());
        System.out.println("Perimeter of Rectangle: "+s2.calculatePerimeter());
        Shape s3= new Triangle(null, null, 23,32,22);
        System.out.println("Area of Triangle:"+s3.calculateArea());
        System.out.println("Perimeter of Triangle: "+s3.calculatePerimeter());
        Shape s4= new Circle(null, null, 23);
        System.out.println("Area of Circle:"+s4.calculateArea());
        System.out.println("Perimeter of Circle: "+s4.calculatePerimeter());
    }
    
}

