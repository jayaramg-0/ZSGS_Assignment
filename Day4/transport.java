public class transport {
    public static void main(String[] args) {
        System.out.println("---------------Transport----------");
        System.out.println();
        Audi audiCar = new Audi("Cityz",35.67,340000.89,5400000.8,5,4,"Petrol");
        Ford fordCar = new Ford("Mustang", 56, 4500000, 5000000, 4, 5, "Petrol");
        audiCar.displayInfo();
        fordCar.displayInfo();

        RoyalEnfield re = new RoyalEnfield("Hunter",35,189000,1,"vapour",5,"Alloy",5);
        Yamaha mt = new Yamaha("Mt-15",40,200000,2,"vapour",5,"Alloy",10);

        re.DisplayInfo();
        mt.DisplayInfo();
    }
}

class Vehicle {
    double milage;
    double price;
    Vehicle(double milage, double price) {
        this.milage = milage;
        this.price = price;
    }
}


class Car extends Vehicle{
    double OwnerShipCost;
    int warranty;
    int seatingCapacity;
    String fuelType;
    Car(double milage, double price, double OwnerShipCost, int warranty, int seatingCapacity, String fuelType) {
        super(milage, price);
        this.OwnerShipCost = OwnerShipCost;
        this.warranty = warranty;
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }
}

class Bike extends Vehicle{
    int NoOfCylinders;
    String Coolingtype;
    int NoOfGears;
    String WheelType;
    int TankSize;
    Bike(double milage, double price, int NoOfCylinders, String Coolingtype, int NoOfGears, String WheelType, int TankSize) {
        super(milage, price);
        this.NoOfCylinders = NoOfCylinders;
        this.Coolingtype = Coolingtype;
        this.NoOfGears = NoOfGears;
        this.WheelType = WheelType;
        this.TankSize = TankSize;
    }
}
class Audi extends Car{
     String modelType;

    public Audi(String modelType, double milage, double price, double OwnerShipCost, int warranty, int seatingCapacity, String fuelType) {
        super(milage, price, OwnerShipCost, warranty, seatingCapacity, fuelType);
        this.modelType = modelType;
    }

    public void displayInfo() {
        System.out.println("Car");
        System.out.println("Audi Model: " + modelType);
        System.out.println("Ownership Cost: " + OwnerShipCost);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + milage + " km/l");
        System.out.println("Price: " + price);
        System.out.println("___________________________________________");
    }
}

class Ford extends Car{
    String modelType;
    public Ford(String modelType, double milage, double price, double OwnerShipCost, int warranty, int seatingCapacity, String fuelType){
        super(milage, price, OwnerShipCost, warranty, seatingCapacity, fuelType);
        this.modelType = modelType;
    }
    public void displayInfo() {
        System.out.println("Car");
        System.out.println("Ford Model: " + modelType);
        System.out.println("Ownership Cost: " + OwnerShipCost);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + milage + " km/l");
        System.out.println("Price: " + price);
        System.out.println("_________________________________");
    }
}
class RoyalEnfield extends Bike{
    String MakeType;
    public RoyalEnfield(String MakeType, double milage,double price, int NoOfCylinders, String CoolingType, int NoOfGears, String WheelType, int TankSize) {
        super(milage, price, NoOfCylinders, CoolingType, NoOfGears, WheelType,TankSize);
        this.MakeType = MakeType;
    }
    void DisplayInfo(){
        System.out.println("Bike");
        System.out.println("Royal Enfield Type: "+ MakeType);
        System.out.println("Milage Of Bike:"+milage);
        System.out.println("Price of Bike :" + price);
        System.out.println("Number of Cylinders :" + NoOfCylinders);
        System.out.println("Cooling Type of Bike:"+ Coolingtype);
        System.out.println("Gears :" + NoOfGears);
        System.out.println("Wheel type :" + WheelType);
        System.out.println("Tank Size :" + TankSize);
        System.out.println("__________________________________________");
    }
}

class Yamaha extends Bike{
    String MakeType;
    public Yamaha(String MakeType, double milage,double price, int NoOfCylinders, String CoolingType, int NoOfGears, String WheelType, int TankSize) {
        super(milage, price, NoOfCylinders, CoolingType, NoOfGears, WheelType,TankSize);
        this.MakeType = MakeType;
    }
    void DisplayInfo(){
        System.out.println("Bike");
        System.out.println("Yamaha Type: "+ MakeType);
        System.out.println("Milage Of Bike:"+milage);
        System.out.println("Price of Bike :" + price);
        System.out.println("Number of Cylinders :" + NoOfCylinders);
        System.out.println("Cooling Type of Bike:"+ Coolingtype);
        System.out.println("Gears :" + NoOfGears);
        System.out.println("Wheel type :" + WheelType);
        System.out.println("Tank Size :" + TankSize);
        System.out.println("__________________________________________");
    }
}