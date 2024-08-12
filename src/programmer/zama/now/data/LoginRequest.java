package programmer.zama.now.data;
// belajar Record Class dikhususkan untuk nyimpan data gak bisa di extend bisanya di implement
public record LoginRequest(String username, String password) {

    public LoginRequest {
        System.out.println("Membuat Object LoginRequest");
    }

    public LoginRequest (String username){
        this(username,"");
    }

    public LoginRequest (){
        this ("","");
    }

    public void sayHello(){

    }

}
