public class GradeIf {
    public static void main(String[] args) {
        int percent = 86;  // You can change this value to test

        if (percent >= 85 && percent <= 100) {
            System.out.println("Grade: A");
        } else if (percent >= 70) {
            System.out.println("Grade: B");
        } else if (percent >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Fail");
        }
    }
}
