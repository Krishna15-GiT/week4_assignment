// ShapeAreaCalculator.java (Ques 4)


abstract class Shape {
    public abstract double calculateArea();
}

// class for rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// class for circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius; // Using 3.14 instead of Math.PI 
    }
}

// class for triangle
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        // Make shapes
        Shape rect = new Rectangle(10, 5);
        Shape circ = new Circle(7);
        Shape tri = new Triangle(6, 4);

        // Get areas and add them
        double total = 0;
        double area1 = rect.calculateArea();
        System.out.println("Rectangle area: " + area1);
        total = total + area1;

        double area2 = circ.calculateArea();
        System.out.println("Circle area: " + area2);
        total = total + area2;

        double area3 = tri.calculateArea();
        System.out.println("Triangle area: " + area3);
        total = total + area3;

        System.out.println("All shapes total area: " + total);
    }
}