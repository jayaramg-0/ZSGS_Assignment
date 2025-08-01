package stringutils;

public class StringUtils {
    public String concatenate(String a, String b) {
        return a + b;
    }

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public int getLength(String str) {
        return str.length();
    }
}
