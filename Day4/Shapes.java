class Shape {
    void disp() {
        System.out.println("This is a shape");
    }
}

class Polygon extends Shape {
    @Override
    void disp() {
        System.out.println("Polygon is a shape");
    }
}

class Rectangle extends Polygon {
    @Override
    void disp() {
        System.out.println("Rectangle is a polygon");
    }
}

class Triangle extends Polygon {
    @Override
    void disp() {
        System.out.println("Triangle is a polygon");
    }
}

class Square extends Rectangle {
    @Override
    void disp() {
        System.out.println("Square is a rectangle");
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Polygon polygon = new Polygon();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        shape.disp();
        polygon.disp();
        rectangle.disp();
        triangle.disp();
        square.disp();
    }
}