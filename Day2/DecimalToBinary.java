public class DecimalToBinary {
    public static String toBinary(int number) {
        String binary = "";

        if (number == 0) return "0";

        while (number > 0) {
            binary = (number % 2) + binary;
            number /= 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        int decimal = 5;
        System.out.println("Binary of " + decimal + " is: " + toBinary(decimal));
    }
}
