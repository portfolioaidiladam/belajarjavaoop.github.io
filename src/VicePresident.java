class VicePresident extends Manager{

    VicePresident (String name) {
        super(name);
    }

    void sayHello (String name){
        System.out.println ("Hi " + name + ", myname Is VP " + this.name);

    }
}
