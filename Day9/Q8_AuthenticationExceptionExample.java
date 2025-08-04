// ‌8. Design a login system that throws AuthenticationException if the username or password is incorrect.
//  Handle it and display a login failure message.
class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

public class Q8_AuthenticationExceptionExample {
    public static void login(String username, String password) throws AuthenticationException {
        if (!username.equals("admin") || !password.equals("1234")) {
            throw new AuthenticationException("Invalid credentials");
        }
    }

    public static void main(String[] args) {
        try {
            login("user", "pass");
        } catch (AuthenticationException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}