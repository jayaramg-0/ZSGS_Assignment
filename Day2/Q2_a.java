public class Q2_a {
    public static void main(String arg[]){
       int rows = 5; // Number of rows
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {

                if(j == i || j == rows - i + 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}
