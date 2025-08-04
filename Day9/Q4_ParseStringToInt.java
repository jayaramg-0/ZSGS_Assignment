// 4. Write a method to parse a string to an integer.
// Throw an exception if the string is not a valid number. Handle it using try-catch.
public class Q4_ParseStringToInt {
    public static void parseInt(String str) {
        try {
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number: " + str);
        }
    }

    public static void main(String[] args) {
        parseInt("123");
        parseInt("abc");
    }
}