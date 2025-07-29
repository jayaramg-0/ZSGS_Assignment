import java.util.Scanner;

class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public void setPoint(int Xvar, int Yvar) {
        x = Xvar;
        y = Yvar;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void printPoint() {
        System.out.println('(' + x + ',' + y + ')');
    }
}

class Circle extends Point {
    private double radius;

    public Circle(){
        super();// helps to call Point method constructor.
        radius = 1;
    }
    public void setRadius(double r){
        if(r > 0){
            radius = r;
        }
        else{
            radius = 1;
        }
    }
    public double getRadius(){
        return radius;
    }
    public double area(){
        return 3.14 * radius *radius;
    }

}

public class CircleOPs {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        
        System.out.println("Enter X:");
        int x = sc.nextInt();

        System.out.println("Enter Y:");
        int y = sc.nextInt();

        System.out.println("Enter radius:");
        double r = sc.nextDouble();

        c.setPoint(x, y);
        c.setRadius(r);

        System.out.println("Circle center is (" + c.getX() + "," + c.getY() + ")");
        System.out.println("Radius is " + c.getRadius());
        System.out.println("Area is " + c.area());

        sc.close();
    }
}