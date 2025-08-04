/*
 * 6. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static 
 * variables and object containment.
Create two classes:
---Store
---Product
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
Task: Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
Also Check how many .class files are generated.
 */
import java.util.ArrayList;
class Store{
    private static String StoreName;
    private static String StoreLocation;
    private static ArrayList<Product> productList = new ArrayList<>();

    //Setting name and location.
    public static void SetStoreDetails(String name, String location){
        StoreName = name;
        StoreLocation = location;
    }
    public static void DisplayStoreDetails(){
        System.out.println("The Store Name :" + StoreName);
        System.out.println("Location of Store: " + StoreLocation);
    }
    //Add product to Store.
     public static void addProduct(Product product) {
        productList.add(product);
    }

    //to Display the products
    public static void displayProducts() {
        System.out.println("Products in " + StoreName + ", " + StoreLocation + ":");
        for (Product p : productList) {
            System.out.println("ID : "+ p.getId() +"\n"+ p.getName() + " : $" + p.getPrice() + "\n" + "Quntity : " + p.getQuantity()+"\n");
        }
    }

}


class Product {
    private String name;
    private double price;
    private int ID;
    private int quantity;

    public Product(int ID,String name, double price, int quantity) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public int getId(){
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    
}




public class MyStore {
    public static void main(String[] args) {
        Store.SetStoreDetails("Devs Stores", "Space");

        Product p1 = new Product(12,"Processor i7",30000,10);
        Product p2 = new Product(13,"GPU",27000,6);

        Store.addProduct(p1);
        Store.addProduct(p2);

        Store.displayProducts();
    }
}

