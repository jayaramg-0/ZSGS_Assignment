public class fSetBit {
    public static void main(String[] args) {
        int number = 18; // Example number
        System.out.println("The first set bit is at position: " + findFirstSetBit(number));
    }

    public static int findFirstSetBit(int num) {
        if (num == 0) {
            return -1; // Return -1 if no set bit is found (number is 0)
        }
        int position = 1; // Position starts from 1
        while ((num & 1) == 0) { // Check if the least significant bit is 0
            num >>= 1; // Right shift the number
            position++; // Increment the position
        }
        return position;
    }
}
