// 1. Illustrates with an example of using Singleton class.
class Singleton {
    private static Singleton instance;
    private Singleton() {
        System.out.println("Singleton instance created");
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class Q1_SingletonExample {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2); // true, both refer to same instance
    }
}