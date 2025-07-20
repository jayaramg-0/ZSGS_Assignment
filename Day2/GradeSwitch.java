public class GradeSwitch {
    public static void main(String[] args) {
        int percent = 86;  // Change this to test
        switch (percent / 10) {
            case 10:
            case 9:
            case 8:
                System.out.println("Grade: A");
                break;
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
            case 5:
                System.out.println("Grade: C");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
