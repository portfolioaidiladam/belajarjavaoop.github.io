package programmer.zama.now.application;

import programmer.zama.now.data.LoginRequest;
import programmer.zama.now.error.ValidationException;
import programmer.zama.now.util.ValidationUtil;

// belajar Exception

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest( "aidil", "rahasia");
        try{
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        }catch (ValidationException |NullPointerException exception){
            System.out.println("Data tidak valid: " + exception.getMessage());
        }finally {
            System.out.println("Selalu di eksekusi");
        }
        /*catch (NullPointerException exception){
            System.out.println("Data null: " + exception.getMessage());
        }*/

        // belajar runtime exception untuk error handling
        LoginRequest loginRequest2 = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukses");


    }
}
