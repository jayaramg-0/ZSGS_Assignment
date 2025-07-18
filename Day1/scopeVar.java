public class scopeVar {
    static int staticVar = 100;// Static variable
    int instanceVar = 200;  // Instance variable (specific to each object)
    public void demonstrateScopes() {
        int localVar = 300; // Local variable
        final int finalVar = 400;  // Final variable (constant, cannot be reassigned after initialization)

        
        for (int blockVar = 0; blockVar < 2; blockVar++) { //In this loop the blockVar is local variable between loop{}
            System.out.println("Block Variable: " + blockVar);
        }
        
        // System.out.println(blockVar); -- unable to use the loop block variable
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Instance Variabl: " + instanceVar);
        System.out.println("Local Variable: " + localVar);
        System.out.println("Final Variable: " + finalVar);
    }

    public static void main(String[] args) {
        // Accessing static variable directly
        System.out.println("Static Variable from main: " + staticVar);

        // Creating an object to access instance variables and methods
        scopeVar demo = new scopeVar();
        demo.demonstrateScopes();

        // Modifying static variable (shared across all instances)
        staticVar = 500;
        System.out.println("Modified Static Variable: " + staticVar);
    }
}
