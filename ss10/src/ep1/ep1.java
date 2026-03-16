package ep1;

public class ep1 {
    interface Shape {
        double perimeter();
        double area();
    }

    static class Circle implements Shape {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle implements Shape {
        double width;
        double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double perimeter() {
            return 2 * (width + height);
        }

        @Override
        public double area() {
            return width * height;
        }
    }

    public static void ep1Main(){
        Circle circle = new Circle(5);
        System.out.printf("Circle - Perimeter: %.2f, Area: %.2f\n", circle.perimeter(), circle.area());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.printf("Rectangle - Perimeter: %.2f, Area: %.2f\n", rectangle.perimeter(), rectangle.area());
    }
}
