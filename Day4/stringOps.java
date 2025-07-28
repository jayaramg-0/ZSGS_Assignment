import java.util.Scanner;
public class stringOps{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("Enter a Starting and ending index:");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("Enter the index to return the character:");
        int index = sc.nextInt();

        MyString myString = new MyString(input);
        System.out.println("Length of the String: " + myString.lenOfStr());
        System.out.println("Uppercased String:  " + myString.toUpCase()); 
        System.out.println("Lowercased String:  " + myString.toLowCase());
        System.out.println("Substring of the String:  " + myString.substr(start,end));
        System.out.println("Character at index " + index + ": " + myString.charAtStr(index));
        sc.close();
    }
}
class MyString{
    String str;

    MyString(String str) {
        this.str = str;
    }

    public int lenOfStr() {
        int count = 0;
        for(char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    public char charAtStr(int index) {
        char result = str.toCharArray()[index];
        return result;
        
    }

    public String substr(int start, int end) {
      String result ="";
      if(str.length() > 0){
      for (int l=start; l<end;l++){
        result+=str.charAt(l);
      }
      }
      else{
        System.out.println("Error");
      }
       return result;
    }

    public String toUpCase() {
        String result = "";
        for(int s = 0; s<str.length(); s++) {
            char c = str.charAt(s);
            if(c >= 'a' && c <= 'z') {
                c = (char)(c - 32);
            }
            result += c;
        }
        return result;
    }

    public String toLowCase() {
        String result = "";
        for(int s = 0; s<str.length(); s++) {
            char c = str.charAt(s);
            if(c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }
            result += c;
        }
        return result;
    }
}