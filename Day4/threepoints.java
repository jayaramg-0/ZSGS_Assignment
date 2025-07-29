class TwoD{
    protected int x, y;
    public TwoD(){
        x = 0;
        y = 0;
        System.out.println("TwoD Default constructor");
    }
    public TwoD(int Xvar, int Yvar){
        x = Xvar;
        y = Yvar;
        System.out.println("TwoD constructor with 2 arguments");
    }
    //setters
    public void setXY(int Xvar, int Yvar){
        x = Xvar;
        y = Yvar;
    }
    //getters
    public int getX(){return x;}
    public int getY(){return y;}
}
class ThreeD extends TwoD{
    private int z;
    public ThreeD(){
        super();
        z = 0;
        System.out.println("ThreeD default Constructor");
    }
    public ThreeD(int xVal, int yVal, int zVal) {
        super(xVal, yVal); // call TwoD's 2-arg constructor
        z = zVal;
        System.out.println("ThreeD constructor with three arguments");
    }
    public void setZ(int zVal){
        z = zVal;

    }
    public int getZ(){
        return z;
    }
    //finding distance
    public double distance(ThreeD other) {
        int dx = other.getX() - this.getX();
        int dy = other.getY() - this.getY();
        int dz = other.getZ() - this.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

}

public class threepoints {
    public static void main(String[] args) {
         // Creating point1 using default constructor
        ThreeD point1 = new ThreeD();

        point1.setXY(1, 2);  // Set x and y using setter from TwoD
        point1.setZ(3);      // Set z using setter from ThreeD

        // Creating point2 using parameterized constructor
        ThreeD point2 = new ThreeD(4, 6, 8);

        // Calculate distance
        double dist = point1.distance(point2);

        System.out.println("Distance between two 3D points: " + dist);
    }
}
