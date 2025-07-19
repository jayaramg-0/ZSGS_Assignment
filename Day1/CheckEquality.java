public class CheckEquality {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 7;
        int check = num1 - num2;
        switch (check) {
            case 0:
                System.out.println("Both are same value.");
                break;
        
            default:
                System.out.println("Both are not same value.");
                break;
        }
    }
}
