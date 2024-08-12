package programmer.zama.now.application;

import programmer.zama.now.error.DatabaseError;

// belajar error exception
public class DatabaseApp {
    public static void main(String[] args) {
       connectDatabase("Aidil",null);
        System.out.println("Sukses");
    }
    public static void connectDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("tidak bisa konek ke database");
        }
    }
}
