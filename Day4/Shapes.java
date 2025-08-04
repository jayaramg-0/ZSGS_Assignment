/*
 * 5. Create a class named Shape with a method that prints "This is a shape".
 * Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape".
 * Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" 
 * and "Triangle is a polygon" respectively. Again, make another class named Square having the same method which prints 
 * "Square is a rectangle".
Now, try calling the method by the object of each of these classes.
 */
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