import java.util.ArrayList;
import java.util.List;

public class BT6 {
    public abstract class Shape {
        public abstract double calculateArea();
    }

    public class Circle extends Shape {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
        }
    }

    public class Rectangle extends Shape {
        private final double width;
        private final double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public Rectangle(double side) {
            this.width = side;
            this.height = side;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
    }

    public static void main(String[] args) {
        BT6 bt = new BT6();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(bt.new Circle(5.0));
        shapes.add(bt.new Rectangle(4.0, 6.0));
        shapes.add(bt.new Rectangle(4.0));

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.getClass().getSimpleName() + ": " + shape.calculateArea());
        }
    }
}