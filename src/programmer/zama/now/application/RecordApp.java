package programmer.zama.now.application;

import programmer.zama.now.data.LoginRequest;

// Belajar Record Class
public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("eko","rahasia");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("aidil"));
        System.out.println(new LoginRequest("aidil","rahasia"));
    }
}
