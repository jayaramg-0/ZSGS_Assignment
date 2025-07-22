public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        // Check if all characters are uppercase
        if (word.equals(word.toUpperCase())) {
            return true;
        }

        // Check if all characters are lowercase
        if (word.equals(word.toLowerCase())) {
            return true;
        }
 
        if (Character.isUpperCase(word.charAt(0)) && 
            word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));     // true
        System.out.println(detectCapitalUse("FlaG"));    // false
        System.out.println(detectCapitalUse("Google"));  // true
        System.out.println(detectCapitalUse("leetcode")); // true
    }
}
