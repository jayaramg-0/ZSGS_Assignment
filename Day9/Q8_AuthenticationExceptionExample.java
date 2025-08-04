// ‌8. Design a login system that throws AuthenticationException if the username or password is incorrect.
//  Handle it and display a login failure message.
import java.util.Scanner;
class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

public class Q8_AuthenticationExceptionExample {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";
    public static void login(String username, String password) throws AuthenticationException {
        if (!USERNAME.equals(username) || !PASSWORD.equals(password)) {
            throw new AuthenticationException("Invalid Username or Password !!");
        }
        else{
            System.out.println("Log-in Successfully !");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the password : ");
            String Uname = sc.next();

            System.out.println("Enter Password : ");
            String passw = sc.next();


            login(Uname,passw);
        } catch (AuthenticationException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}