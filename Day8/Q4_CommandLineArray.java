//  Get some strings through the command-line prompt and use an array to store and display them
public class Q4_CommandLineArray {

    public static void main(String[] args) {
        System.out.println("Strings received from command-line:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("String[" + i + "] = " + args[i]);
        }
    }
}