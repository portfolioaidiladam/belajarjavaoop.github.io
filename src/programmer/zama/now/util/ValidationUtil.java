package programmer.zama.now.util;

import programmer.zama.now.data.LoginRequest;
import programmer.zama.now.error.BlankException;
import programmer.zama.now.error.ValidationException;
// Belajar Exception
public class ValidationUtil {

    public static void validate (LoginRequest loginRequest) throws ValidationException, NullPointerException{
     if (loginRequest.username()==null) {
         throw new NullPointerException("Username is null");
     }else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is Blank");
        }
     else if (loginRequest.password()==null) {
         throw new NullPointerException("Password is null");
     }
     else if (loginRequest.password().isBlank()) {
         throw new ValidationException("Password is Blank");
     }
     }

     //belajar Runtime Exception

     public static void validateRuntime(LoginRequest loginRequest){
     if (loginRequest.username()==null) {
         throw new NullPointerException("Username is null");
     }else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is Blank");
        }
     else if (loginRequest.password()==null) {
         throw new NullPointerException("Password is null");
     }
     else if (loginRequest.password().isBlank()) {
         throw new BlankException("Password is Blank");
     }
     }
    }

