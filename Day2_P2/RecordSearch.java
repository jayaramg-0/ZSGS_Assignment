import java.util.Scanner;
import java.util.Arrays;
public class RecordSearch {
    public static void main(String[] args) {
        int[] years = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
        Arrays.sort(years);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year of graduation: ");
        int key = sc.nextInt();
        int low = 0, high = years.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (years[mid] == key) {
                found = true;
                break;
            } else if (years[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println(found ? "Record exists" : "Record does not exist");
        sc.close();
    }
}