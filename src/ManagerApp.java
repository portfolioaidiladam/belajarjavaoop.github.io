public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Aidil");
        //manager.name = "Aidil";
        manager.sayHello ("Budi");

        var vp = new VicePresident("Joko");
        //vp.name = "Joko";
        vp.sayHello("Budi");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp);
        System.out.println(vp.toString());
    }
}
