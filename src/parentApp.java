public class parentApp {
    public static void main(String[] args) {

        Child child = new Child();
        child.name = "Aidil";
        child.doIt();
        System.out.println(child.name);

        // boleh menulis seperti dibawah ini secara eksplisit outputnya akan memanggil method di childnya karena method overidenya
        Parent parent = (Parent) child ;
        //Parent parent =  child ;

        //kecuali kalau buat new parent, yah otomatis yang di acces adalah si parentnya
        //Parent parent =  new Parent() ;

        parent.name = "EKO";
        parent.doIt();
        System.out.println(parent.name);



    }
}
