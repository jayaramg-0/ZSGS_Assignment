import java.io.*;
// 9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.
public class Q9_ReadFileExample {
    public static void readFile(String fileName) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("IO Error: " + e);
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e);
            }
        }
    }

    public static void main(String[] args) {
        readFile("test.txt");
    }
}